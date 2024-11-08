package sampleproject.lib;

public class TestLib {
	private int x;
	private int y;
	
	public TestLib(int x,int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "TestLib [x=" + x + ", y=" + y + "]";
	}
	
	
}
