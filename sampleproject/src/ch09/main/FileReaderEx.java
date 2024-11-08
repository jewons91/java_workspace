package ch09.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
//		텍스트 파일 읽기 => FileReader
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\window\\system.ini");
			int c;
			while((c=fr.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	// 무조건 마지막에 실행되는 블록
			try {
				if (fr != null) {
					fr.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}	// 1. close를 못할 수 있다 => IOException 발생시킨다.
				// 2. fr 이 null인지 확인해서 close 해야 한다.
		}
		
	}

}
