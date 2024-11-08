package ch09.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
//		데이터 생성
		byte[] data = {7,51,3,4,-1,24};
		FileOutputStream fos = null;
//		try(FileOutputStream fos = new FileOutputStream("c:\\temp\\test.data"));
//		try ~ with resource 문 : finally로 close() 안해도 된다. 자동 close 된다.
		try {
			fos = new FileOutputStream("c:\\temp\\test.data",true);	// 추가
			for(byte k:data) {
				fos.write(k);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();	// error 발생 원인 출력, 개발시 사용, 개발 끝나면 삭제
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("test.data에 정상 저장");
	}

}
