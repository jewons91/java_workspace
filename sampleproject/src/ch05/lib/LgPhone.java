package ch05.lib;

public class LgPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("엘지폰 전화 걸다");
	}

	@Override
	public void receiveCall() {
		System.out.println("엘지폰 전화 받다");
	}
	
}
