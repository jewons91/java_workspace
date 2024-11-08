package ch08.lib;

public class WorkerThread extends Thread{
	private SharedPrinter p;
	private String[] text;
	
	public WorkerThread(SharedPrinter p, String[] text) {
		this.p = p;
		this.text = text;
	}
	
	@Override
	public void run() {
		for(int i=0; i<text.length; i++) {
			p.print(text[i]);
		}
	}
}
