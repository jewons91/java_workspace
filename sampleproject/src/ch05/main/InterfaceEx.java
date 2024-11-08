package ch05.main;

import ch05.lib.LgPhone;
import ch05.lib.PhoneInterface;
import ch05.lib.SamsungPhone;

public class InterfaceEx {

	public static void main(String[] args) {
		PhoneInterface phone = new LgPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
	}

}
