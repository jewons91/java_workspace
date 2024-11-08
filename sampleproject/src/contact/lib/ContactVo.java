package contact.lib;

import java.io.Serializable;

public class ContactVo implements Serializable {
	private static final long serialVersionUID = 12346638481829L;

	private String name;
	private String phone;
	private String address;
	private String classify;

	public ContactVo() {
	}

	public ContactVo(String name, String phone, String address, String classify) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.classify = classify;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	@Override
	public String toString() {
		return "이름 = " + name + ", 전화번호 : " + phone + ", 주소 : " + address + ", 분류 : " + classify;
	}
}

//	public static void printMenu() {
//		System.out.println();
//		System.out.println("==========================\n" + " 다음 메뉴 중 하나를 선택하세요. \n" + "==========================");
//		System.out.println("1. 회원 추가\n" + "2. 회원 목록 보기\n" + "3. 회원 정보 수정하기\n" + "4. 회원 삭제\n" + "5. 종료");
//		System.out.print("메뉴 선택 >> ");
//	}
//
//	private static boolean checkOverlap(HashMap<Integer, ContactVo> contacts, int phone) {
//		for (Integer i : contacts.keySet()) {
//			if (i == phone) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	private static boolean checkClassify(String classify) {
//		return classify.matches("친구|가족|회사|기타");
//	}
//
//	private static boolean phoneCheck(int phone) {
//		String phoneCheck = "0" + phone;
//		if (Pattern.matches("^010\\d{8}", phoneCheck)) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	public static void addContact(HashMap<Integer, ContactVo> contacts, Scanner scanner) {
//		System.out.println("등록할 회원의 정보를 입력하세요.");
//		String name;
//		while (true) {
//			System.out.print("이름 : ");
//			name = scanner.nextLine();
//			if (name.contains(" ")) {
//				System.out.println("공백없이 입력해주세요.");
//			} else {
//				break;
//			}
//		}
//		int phone = 0;
//		while (true) {
//			System.out.print("전화번호(ex : 01012345678) : ");
//			phone = TryCatch.InputMismatch(phone, scanner);
//			if (checkOverlap(contacts, phone)) {
//				System.out.println("중복된 전화번호입니다. 다시 입력해주세요.");
//			} else if (phoneCheck(phone)) {
//				break;
//			} else {
//				System.out.println("형식이 잘못된 번호입니다. 다시 입력해주세요.");
//			}
//		}
//		System.out.print("주소 : ");
//		String address = scanner.nextLine();
//		String classify;
//		while (true) {
//			System.out.print("분류(ex : 가족, 친구, 회사, 기타) : ");
//			classify = scanner.nextLine();
//			if (checkClassify(classify)) {
//				break;
//			} else {
//				System.out.println("잘못 입력. 분류 예시로 입력하세요.");
//			}
//		}
//		contacts.put(phone, new ContactVo(name, phone, address, classify));
//	}
//
//	public static void printContact(HashMap<Integer, ContactVo> contacts) {
//		System.out.println("총 " + contacts.size() + " 명의 회원이 저장되어 있습니다.");
//		for (ContactVo i : contacts.values()) {
//			System.out.println("회원정보 : " + i);
//		}
//	}
//
//	public static void updateContact(HashMap<Integer, ContactVo> contacts, Scanner scanner) {
//		ArrayList<ContactVo> temp = new ArrayList<>();
//		while (true) {
//			System.out.println("수정할 회원의 이름을 입력하세요. 수정을 안 하려면 '취소'를 입력해주세요.");
//			System.out.print("이름 : ");
//			String name = scanner.nextLine();
//			if (!name.equals("취소")) {
//				for (ContactVo i : contacts.values()) {
//					if (i.getName().contains(name)) {
//						temp.add(i);
//					}
//				}
//				if (temp.size() != 0) {
//					System.out.println("총 " + temp.size() + "개의 목록이 검색되었습니다.");
//					System.out.println("아래 목록 중 수정할 회원의 번호를 입력하세요.");
//					for (int i = 0; i < temp.size(); i++) {
//						System.out.println((i + 1) + "." + temp.get(i));
//					}
//					int idx = -1;
//					System.out.print("\n번호 입력 >> ");
//					idx = TryCatch.InputMismatch(idx, scanner);
//					System.out.println("전화번호 변경하시겠습니까? 변경하실려면 숫자 1을 입력해주세요. 아니면 아무 숫자나~");
//					int phoneChange = 0;
//					System.out.print(">> ");
//					phoneChange = TryCatch.InputMismatch(phoneChange, scanner);
//					int tempKey = temp.get(idx - 1).getPhone();
//					System.out.println("수정할 정보를 입력하세요.");
//					int phone = 0;
//					if (phoneChange == 1) {
//						while (true) {
//							System.out.print("전화번호(ex : 01012345678) : ");
//							phone = TryCatch.InputMismatch(phone, scanner);
//							if (checkOverlap(contacts, phone)) {
//								System.out.println("중복된 전화번호입니다. 다시 입력해주세요.");
//							} else if (phoneCheck(phone)) {
//								temp.get(idx - 1).setPhone(phone);
//								break;
//							} else {
//								System.out.println("잘못된 형식의 번호입니다. 다시 입력해주세요.");
//							}
//						}
//					}
//					System.out.print("주소: ");
//					temp.get(idx - 1).setAddress(scanner.nextLine());
//					while (true) {
//						System.out.print("분류(ex : 가족, 친구, 회사, 기타) : ");
//						temp.get(idx - 1).setClassify(scanner.nextLine());
//						if (checkClassify(temp.get(idx - 1).getClassify())) {
//							break;
//						} else {
//							System.out.println("잘못 입력. 분류 예시로 입력하세요.");
//						}
//					}
//					System.out.println("수정이 완료되었습니다.");
//					if (tempKey != temp.get(idx - 1).getPhone()) {
//						contacts.put(temp.get(idx - 1).getPhone(), temp.get(idx - 1));
//						contacts.remove(tempKey);
//					}
//					temp.clear();
//					break;
//				} else {
//					System.out.println("해당하는 회원 정보가 없습니다.");
//				}
//			} else {
//				break;
//			}
//		}
//	}
//
//	public static void removeContact(HashMap<Integer, ContactVo> contacts, Scanner scanner) {
//		ArrayList<ContactVo> temp = new ArrayList<>();
//		while (true) {
//			System.out.println("삭제할 회원의 이름을 입력하세요. 삭제를 안 하려면 '취소'를 입력해주세요.");
//			System.out.print("이름 : ");
//			String name = scanner.nextLine();
//			if (!name.equals("취소")) {
//				for (ContactVo i : contacts.values()) {
//					if (i.getName().contains(name)) {
//						temp.add(i);
//					}
//				}
//				if (temp.size() != 0) {
//					System.out.println("총 " + temp.size() + "개의 목록이 검색되었습니다.");
//					System.out.println("아래 목록 중 삭제할 회원의 번호를 입력하세요.");
//					for (int i = 0; i < temp.size(); i++) {
//						System.out.println((i + 1) + "." + temp.get(i));
//					}
//					int idx = -1;
//					System.out.print("\n번호 입력 >> ");
//					idx = TryCatch.InputMismatch(idx, scanner);
//					contacts.remove(temp.get(idx - 1).getPhone());
//					System.out.println("삭제가 완료되었습니다.");
//					temp.clear();
//					break;
//				} else {
//					System.out.println("해당하는 회원 정보가 없습니다.");
//				}
//			} else {
//				break;
//			}
//		}
//	}
//}
