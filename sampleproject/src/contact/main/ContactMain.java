package contact.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

import contact.lib.Contact;
import contact.lib.ContactApp;
import contact.lib.ContactVo;
import contact.lib.TryCatch;

public class ContactMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, ContactVo> contacts = new HashMap<>();
		Contact contact = new ContactApp();
		int menu = 0;

		try (FileInputStream fis = new FileInputStream("c:\\temp\\project1\\contact.data");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			contacts = (HashMap<String, ContactVo>) ois.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
//			e.printStackTrace();
		}

		System.out.println("연락처 프로그램입니다.");
		do {
			contact.printMenu();
			menu = TryCatch.InputMismatch(menu, scanner);
			switch (menu) {
			case 1:
				contact.addContact(contacts, scanner);
				break;
			case 2:
				contact.printContact(contacts);
				break;
			case 3:
				contact.updateContact(contacts, scanner);
				break;
			case 4:
				contact.removeContact(contacts, scanner);
				break;
			case 5:
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		} while (menu != 5);

		try (FileOutputStream fos = new FileOutputStream("c:\\temp\\project1\\contact.data");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(contacts);
		} catch (FileNotFoundException e) {
			System.out.println("지정된 디렉터리가 없습니다.");
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		}
	}
}
