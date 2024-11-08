package ch09.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopy {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;	// 한번애 import : CTRL + SHIFT + O (영문자)
		
		int c;	// 중간에 한문자 저장할 변수
		
//		1. 읽기
		try {
			fr = new FileReader("c:\\windows\\system.ini");
			fw = new FileWriter("c:\\temp\\system.txt");
			
			while((c=fr.read()) != -1) {	// -1 : EOF => 파일끝
				fw.write((char)c);
			}
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 저장 복사");
	}

}
