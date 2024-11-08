package ch09.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		byte[] data = new byte[12];
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c:\\temp\\test.data");
			int idx = 0;	// 인덱스
			int num = 0;	// 입력된 값을 저장할 변수 read() -> num
			
			while((num = fis.read()) != -1) {	// 12 반복
				data[idx] = (byte)num;
				idx++;
			}
//			화면에 출력
			for(byte k : data) {
				System.out.print(k + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
