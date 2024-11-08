package contact.lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ContactApp implements Contact {

	@Override
	public void printMenu() {
		System.out.println();
		System.out.println("==========================\n" + " 다음 메뉴 중 하나를 선택하세요. \n" + "==========================");
		System.out.println("1. 회원 추가\n" + "2. 회원 목록 보기\n" + "3. 회원 정보 수정하기\n" + "4. 회원 삭제\n" + "5. 종료");
		System.out.print("메뉴 선택 >> ");
	}

	private boolean checkOverlap(HashMap<String, ContactVo> contacts, String phoneString) {
		for (String i : contacts.keySet()) {
			if (i.equals(phoneString)) {
				return true;
			}
		}
		return false;
	}

	private boolean phoneCheck(String phoneString) {
		if (Pattern.matches("^010\\d{8}", phoneString)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkClassify(String classify) {
		return classify.matches("친구|가족|회사|기타");
	}

	@Override
	public void addContact(HashMap<String, ContactVo> contacts, Scanner scanner) {
		System.out.println("등록할 회원의 정보를 입력하세요.");
		String name;
		String phoneString;
		while (true) {
			System.out.print("이름 : ");
			name = scanner.nextLine();
			if (name.contains(" ")) {
				System.out.println("공백없이 입력해주세요.");
			} else {
				break;
			}
		}
		int phone = 0;
		while (true) {
			System.out.print("전화번호(ex : 01012345678) : ");
			phone = TryCatch.InputMismatch(phone, scanner);
			phoneString = "0" + phone;
			if (checkOverlap(contacts, phoneString)) {
				System.out.println("중복된 전화번호입니다. 다시 입력해주세요.");
			} else if (phoneCheck(phoneString)) {
				break;
			} else {
				System.out.println("형식이 잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
		System.out.print("주소 : ");
		String address = scanner.nextLine();
		String classify;
		while (true) {
			System.out.print("분류(ex : 가족, 친구, 회사, 기타) : ");
			classify = scanner.nextLine();
			if (checkClassify(classify)) {
				break;
			} else {
				System.out.println("잘못 입력. 분류 예시로 입력하세요.");
			}
		}
		contacts.put(phoneString, new ContactVo(name, phoneString, address, classify));
	}

	@Override
	public void printContact(HashMap<String, ContactVo> contacts) {
		System.out.println("총 " + contacts.size() + " 명의 회원이 저장되어 있습니다.");
		for (ContactVo i : contacts.values()) {
			System.out.println("회원정보 : " + i);
		}
	}

	@Override
	public void updateContact(HashMap<String, ContactVo> contacts, Scanner scanner) {
		ArrayList<ContactVo> temp = new ArrayList<>();
		while (true) {
			System.out.println("수정할 회원의 이름을 입력하세요. 수정을 안 하려면 '취소'를 입력해주세요.");
			System.out.print("이름 : ");
			String name = scanner.nextLine();
			if (!name.equals("취소")) {
				for (ContactVo i : contacts.values()) {
					if (i.getName().contains(name)) {
						temp.add(i);
					}
				}
				if (temp.size() != 0) {
					System.out.println("총 " + temp.size() + "개의 목록이 검색되었습니다.");
					System.out.println("아래 목록 중 수정할 회원의 번호를 입력하세요.");
					for (int i = 0; i < temp.size(); i++) {
						System.out.println((i + 1) + "." + temp.get(i));
					}
					int idx = -1;
					while (true) {
						System.out.print("번호 입력 >> ");
						idx = TryCatch.InputMismatch(idx, scanner);
						if (idx <= temp.size()) {
							break;
						} else {
							System.out.println("잘못입력하셨습니다.");
						}
					}
					String tempKey = temp.get(idx - 1).getPhone();
					System.out.println("수정할 정보를 입력하세요.");
					while (true) {
						int phone = 0;
						String phoneString;
						System.out.print("전화번호(ex : 01012345678) : ");
						phone = TryCatch.InputMismatch(phone, scanner);
						phoneString = "0" + phone;
						if (temp.get(idx - 1).getPhone().equals(phoneString)) {
							break;
						} else {
							if (checkOverlap(contacts, phoneString)) {
								System.out.println("중복된 전화번호입니다. 다시 입력해주세요.");
							} else if (phoneCheck(phoneString)) {
								temp.get(idx - 1).setPhone(phoneString);
								break;
							} else {
								System.out.println("형식이 잘못된 번호입니다. 다시 입력해주세요.");
							}
						}
					}

					System.out.print("주소: ");
					temp.get(idx - 1).setAddress(scanner.nextLine());
					while (true) {
						System.out.print("분류(ex : 가족, 친구, 회사, 기타) : ");
						temp.get(idx - 1).setClassify(scanner.nextLine());
						if (checkClassify(temp.get(idx - 1).getClassify())) {
							break;
						} else {
							System.out.println("잘못 입력. 분류 예시로 입력하세요.");
						}
					}
					System.out.println("수정이 완료되었습니다.");
					if (tempKey != temp.get(idx - 1).getPhone()) {
						contacts.put(temp.get(idx - 1).getPhone(), temp.get(idx - 1));
						contacts.remove(tempKey);
					}
					temp.clear();
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
	public void removeContact(HashMap<String, ContactVo> contacts, Scanner scanner) {
		ArrayList<ContactVo> temp = new ArrayList<>();
		while (true) {
			System.out.println("삭제할 회원의 이름을 입력하세요. 삭제를 안 하려면 '취소'를 입력해주세요.");
			System.out.print("이름 : ");
			String name = scanner.nextLine();
			if (!name.equals("취소")) {
				for (ContactVo i : contacts.values()) {
					if (i.getName().contains(name)) {
						temp.add(i);
					}
				}
				if (temp.size() != 0) {
					System.out.println("총 " + temp.size() + "개의 목록이 검색되었습니다.");
					System.out.println("아래 목록 중 삭제할 회원의 번호를 입력하세요.");
					for (int i = 0; i < temp.size(); i++) {
						System.out.println((i + 1) + "." + temp.get(i));
					}
					int idx = -1;
					while (true) {
						System.out.print("번호 입력 >> ");
						idx = TryCatch.InputMismatch(idx, scanner);
						if (idx <= temp.size()) {
							break;
						} else {
							System.out.println("잘못 입력하셨습니다.");
						}
					}
					contacts.remove(temp.get(idx - 1).getPhone());
					System.out.println("삭제가 완료되었습니다.");
					temp.clear();
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
