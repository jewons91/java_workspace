package contact.lib;

import java.util.HashMap;
import java.util.Scanner;

public interface Contact {
	void printMenu();

	void addContact(HashMap<String, ContactVo> contacts, Scanner scanner);

	void printContact(HashMap<String, ContactVo> contacts);

	void updateContact(HashMap<String, ContactVo> contacts, Scanner scanner);

	void removeContact(HashMap<String, ContactVo> contacts, Scanner scanner);
}
