package ch09.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
//		FileReader fr = null;
		try(FileReader fr = new FileReader("c:\\windows\\system.ini")) {
			int c;
			while((c=fr.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		fr = new FileReader("c:\\windows\\system.ini");
//		fr.close();	// 자동 close 가능
	}

}
