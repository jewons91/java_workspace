package project2.main;

import java.util.Scanner;

import contact.lib.TryCatch;
import project2.lib.Contact;
import project2.lib.ContactDBService;

/**
 * Description : 연락처 프로그램 <br>
 * Date : 2024. 5. 13. <br>
 * History : <br>
 * - @author : Jewon <br>
 * - 날짜 : 2024. 5. 13. <br>
 * - 설명 : 최초작성 <br>
 * @version 1.0
 */
public class ContactMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Contact contact = new ContactDBService();
		int menu = 0;

		System.out.println("연락처 프로그램입니다.");
		do {
			contact.printMenu();
			menu = TryCatch.InputMismatch(menu, scanner);
			switch (menu) {
			case 1:
				contact.addContact(scanner);
				break;
			case 2:
				contact.printContact(scanner);
				break;
			case 3:
				contact.updateContact(scanner);
				break;
			case 4:
				contact.removeContact(scanner);
				break;
			case 5:
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		} while (menu != 5);
		scanner.close();
	}
}
