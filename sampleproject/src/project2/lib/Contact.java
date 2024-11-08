package project2.lib;

import java.util.Scanner;

/**
 * Description : DB 연락처 서비스 인터페이스 <br>
 * Date : 2024. 5. 13. <br>
 * History : <br>
 * - @author : Jewon <br>
 * - 날짜 : 2024. 5. 13. <br>
 * - 설명 : 최초작성 <br>
 * @version 1.0
 */
public interface Contact {
	void printMenu();

	void addContact(Scanner scanner);

	void printContact(Scanner scanner);

	void updateContact(Scanner scanner);

	void removeContact(Scanner scanner);
}
