package ch09.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		
//		키보드에서 한자씩 받아서 문자 변환 (InputStreamReader) 입력받는 코드
		InputStreamReader isr = new InputStreamReader(System.in);
		
//		텍스트 파일에 문자 쓰는 놈 변수 선언 : FileWriter
		FileWriter fw = null;
		
		try {
//			FNFE 아니라 IOException 이다 : 쓰기는 파일이 없으면 새로 만든다, 권한없어서 예외발생 가능, 디렉토리 없을 경우
			fw = new FileWriter("c:\\temp\\test.txt");
//			읽기하고 쓰기 진행, 입력의 끝까지(ctrl + z : EOF)
			int c;
			while((c = isr.read()) != -1) {	// -1 이면 EOF 의미
				fw.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
