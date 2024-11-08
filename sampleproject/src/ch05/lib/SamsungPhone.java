package ch05.lib;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("삼성폰 전화 건다");
	}

	@Override
	public void receiveCall() {
		System.out.println("삼성폰 전화 받다");
	}
	
}
