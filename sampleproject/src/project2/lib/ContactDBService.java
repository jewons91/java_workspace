package project2.lib;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

import contact.lib.TryCatch;

/**
 * Description : DB 연락처 서비스 <br>
 * Date : 2024. 5. 13. <br>
 * History : <br>
 * - @author : Jewon <br>
 * - 날짜 : 2024. 5. 13. <br>
 * - 설명 : 최초작성 <br>
 * 
 * @version 1.0
 */
public class ContactDBService implements Contact {
	
	private boolean checkOverlap(String phoneString) {
		String sql = "SELECT *				" 
					+ "  FROM contact a		" 
					+ " WHERE a.PHONE LIKE ?";
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, phoneString);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				DBConnection.closeConnection(con);
				return true;
			} else {
				DBConnection.closeConnection(con);
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			DBConnection.closeConnection(con);
			return false;
		}
	}

	private boolean phoneCheck(String phoneString) {
		if (Pattern.matches("^010\\d{8}", phoneString)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkGubun(String gubun_nm) {
		return gubun_nm.matches("친구|가족|회사|기타");
	}

	private String getGubun_cd(String gubun_nm) {
		String sql = "SELECT a.GUBUN_CD				" 
				+ "  FROM gubun a				"
				+ " WHERE a.GUBUN_NM LIKE ?		";
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, gubun_nm);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String gubun_cd = rs.getString("gubun_cd");
			DBConnection.closeConnection(con);
			return gubun_cd;
		} catch (SQLException e) {
			e.printStackTrace();
			DBConnection.closeConnection(con);
			return null;
		}
	}

	private int insert(ContactVo contactVo) {
		String sql = "INSERT INTO CONTACT			" 
					+ "VALUES (?,numbering(),?,?,?)	";
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, contactVo.getName());
			pstmt.setString(2, contactVo.getPhone());
			pstmt.setString(3, contactVo.getAddress());
			pstmt.setString(4, contactVo.getGubun_nm());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			DBConnection.closeConnection(con);
		}
	}

	private ArrayList<ContactVo> select() {
		ArrayList<ContactVo> contactList = new ArrayList<ContactVo>();
		String sql = "SELECT a.NAME							"
					+ "	 , a.PHONE							"
					+ "	 , a.ADDRESS						"
					+ "	 , (SELECT b.gubun_nm				"
					+ "	 	  FROM gubun b					"
					+ "	 	 WHERE b.gubun_cd = a.GUBUN_CD	"
					+ "	   ) AS gubun_nm					"
					+ "  FROM contact a						";
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String gubun_nm = rs.getString("gubun_nm");
				ContactVo contact = new ContactVo(name, phone, address, gubun_nm);
				contactList.add(contact);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(con);
		}
		return contactList;
	}

	private HashMap<String, ContactVo> select(String typeName) {
		String searchName = "%" + typeName + "%";
		HashMap<String, ContactVo> contactList = new HashMap<String, ContactVo>();
		String sql = "SELECT a.NAME							"
					+ "	 , a.PHONE_ID						"
					+ "	 , a.PHONE							"
					+ "	 , a.ADDRESS						"
					+ "	 , (SELECT b.gubun_nm				"
					+ "	 	  FROM gubun b					"
					+ "	 	 WHERE a.GUBUN_CD = b.GUBUN_CD	"
					+ "	   ) AS gubun_nm					"
					+ "  FROM contact a						"
					+ " WHERE a.name LIKE ?					";
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, searchName);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String phone_id = rs.getString("phone_id");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String gubun_nm = rs.getString("gubun_nm");
				ContactVo contact = new ContactVo(name, phone, address, gubun_nm);
				contactList.put(phone_id, contact);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(con);
		}
		return contactList;
	}

	private int update(ArrayList<String> keyList, HashMap<String, ContactVo> contactList, int idx) {
		String sql = "UPDATE CONTACT		" 
					+ "   SET phone = ?		" 
					+ "   	 , address = ?	"
					+ "   	 , gubun_cd = ?	" 
					+ " WHERE PHONE_ID = ?	";
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, contactList.get(keyList.get(idx - 1)).getPhone());
			pstmt.setString(2, contactList.get(keyList.get(idx - 1)).getAddress());
			pstmt.setString(3, getGubun_cd(contactList.get(keyList.get(idx - 1)).getGubun_nm()));
			pstmt.setString(4, keyList.get(idx - 1));

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			DBConnection.closeConnection(con);
		}
	}

	private int delete(ArrayList<String> keyList, int idx) {
		Connection con = DBConnection.getConnection();
		String sql = "DELETE FROM contact a	" 
					+ " WHERE a.phone_id = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, keyList.get(idx - 1));
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			DBConnection.closeConnection(con);
		}
	}

	@Override
	public void printMenu() {
		System.out.println();
		System.out.println("==========================\n" + " 다음 메뉴 중 하나를 선택하세요. \n" + "==========================");
		System.out.println("1. 회원 추가\n" + "2. 회원 목록 보기\n" + "3. 회원 정보 수정하기\n" + "4. 회원 삭제\n" + "5. 종료");
		System.out.print("메뉴 선택 >> ");
	}

	@Override
	public void addContact(Scanner scanner) {
		System.out.println("등록할 회원의 정보를 입력하세요.");
		String name;
		while (true) {
			System.out.print("이름 : ");
			name = scanner.nextLine();
			if (name.contains(" ")) {
				System.out.println("공백없이 입력해주세요.");
			} else {
				break;
			}
		}
		String phoneString;
		int phone = 0;
		while (true) {
			System.out.print("전화번호(ex : 01012345678) : ");
			phone = TryCatch.InputMismatch(phone, scanner);
			phoneString = "0" + phone;
			if (checkOverlap(phoneString)) {
				System.out.println("중복된 전화번호입니다. 다시 입력해주세요.");
			} else if (phoneCheck(phoneString)) {
				break;
			} else {
				System.out.println("형식이 잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
		System.out.print("주소 : ");
		String address = scanner.nextLine();
		String gubun_nm;
		while (true) {
			System.out.print("분류(ex : 가족, 친구, 회사, 기타) : ");
			gubun_nm = scanner.nextLine();
			if (checkGubun(gubun_nm)) {
				break;
			} else {
				System.out.println("잘못 입력. 분류 예시로 입력하세요.");
			}
		}
		String gubun_cd = getGubun_cd(gubun_nm);
		ContactVo contactVo = new ContactVo(name, phoneString, address, gubun_cd);
		insert(contactVo);
	}

	@Override
	public void printContact(Scanner scanner) {
		int menu = 0;
		while(true) {
			System.out.print("1. 전체 목록\t2. 이름 검색\n중 원하시는 항목을 선택하세요 : ");
			menu = TryCatch.InputMismatch(menu, scanner);
			if (menu == 1) {
				ArrayList<ContactVo> contactList = select();
				System.out.println("총 " + contactList.size() + " 명의 회원이 저장되어 있습니다.");
				for (ContactVo i : contactList) {
					System.out.println("회원정보 : " + i);
				}
				break;
			} else if (menu == 2) {
				System.out.println("검색할 회원의 이름을 입력하세요.");
				System.out.print("이름 : ");
				String typeName = scanner.nextLine();
				HashMap<String, ContactVo> searchList = select(typeName);
				System.out.println("총 " + searchList.size() + " 명의 회원이 검색되었습니다.");
				for (ContactVo i : searchList.values()) {
					System.out.println("회원 정보 : " + i);
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	@Override
	public void updateContact(Scanner scanner) {
		while (true) {
			System.out.println("수정할 회원의 이름을 입력하세요. 수정을 안 하려면 '취소'를 입력해주세요.");
			System.out.print("이름 : ");
			String typeName = scanner.nextLine();
			if (!typeName.equals("취소")) {
				HashMap<String, ContactVo> contactList = select(typeName);
				ArrayList<String> keyList = new ArrayList<String>();
				if (contactList.size() != 0) {
					System.out.println("총 " + contactList.size() + "개의 목록이 검색되었습니다.");
					System.out.println("아래 목록 중 수정할 회원의 번호를 입력하세요.");
					int count = 0;
					for (String i : contactList.keySet()) {
						System.out.println((count + 1) + "." + contactList.get(i));
						keyList.add(i);
						count++;
					}
					int idx = -1;
					while (true) {
						System.out.print("번호 입력 >> ");
						idx = TryCatch.InputMismatch(idx, scanner);
						if (idx <= contactList.size() && idx > 0) {
							break;
						} else {
							System.out.println("잘못입력하셨습니다.");
						}
					}
					System.out.println("수정할 정보를 입력하세요.");
					while (true) {
						int phone = 0;
						String phoneString;
						System.out.print("전화번호(ex : 01012345678) : ");
						phone = TryCatch.InputMismatch(phone, scanner);
						phoneString = "0" + phone;
						if (contactList.get(keyList.get(idx - 1)).getPhone().equals(phoneString)) {
							break;
						} else {
							if (checkOverlap(phoneString)) {
								System.out.println("중복된 전화번호입니다. 다시 입력해주세요.");
							} else if (phoneCheck(phoneString)) {
								contactList.get(keyList.get(idx - 1)).setPhone(phoneString);
								break;
							} else {
								System.out.println("형식이 잘못된 번호입니다. 다시 입력해주세요.");
							}
						}
					}

					System.out.print("주소: ");
					contactList.get(keyList.get(idx - 1)).setAddress(scanner.nextLine());
					while (true) {
						System.out.print("분류(ex : 가족, 친구, 회사, 기타) : ");
						contactList.get(keyList.get(idx - 1)).setGubun_nm(scanner.nextLine());
						if (checkGubun(contactList.get(keyList.get(idx - 1)).getGubun_nm())) {
							break;
						} else {
							System.out.println("잘못 입력. 분류 예시로 입력하세요.");
						}
					}
					update(keyList, contactList, idx);
					System.out.println("수정이 완료되었습니다.");
					break;
				} else {
					System.out.println("해당하는 회원 정보가 없습니다.");
				}
			} else {
				break;
			}
		}
	}

	@Override
	public void removeContact(Scanner scanner) {
		while (true) {
			System.out.println("삭제할 회원의 이름을 입력하세요. 삭제를 안 하려면 '취소'를 입력해주세요.");
			System.out.print("이름 : ");
			String typeName = scanner.nextLine();
			if (!typeName.equals("취소")) {
				HashMap<String, ContactVo> contactList = select(typeName);
				ArrayList<String> keyList = new ArrayList<String>();
				if (contactList.size() != 0) {
					System.out.println("총 " + contactList.size() + "개의 목록이 검색되었습니다.");
					System.out.println("아래 목록 중 삭제할 회원의 번호를 입력하세요.");
					int count = 0;
					for (String i : contactList.keySet()) {
						System.out.println((count + 1) + "." + contactList.get(i));
						keyList.add(i);
						count++;
					}
					int idx = -1;
					while (true) {
						System.out.print("번호 입력 >> ");
						idx = TryCatch.InputMismatch(idx, scanner);
						if (idx <= contactList.size()) {
							break;
						} else {
							System.out.println("잘못 입력하셨습니다.");
						}
					}
					delete(keyList, idx);
					System.out.println("삭제가 완료되었습니다.");
					break;
				} else {
					System.out.println("해당하는 회원 정보가 없습니다.");
				}
			} else {
				break;
			}
		}
	}
}
