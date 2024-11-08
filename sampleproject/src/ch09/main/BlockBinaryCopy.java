package ch09.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopy {

	public static void main(String[] args) {
		File src = new File("c:\\temp\\img.jpg");
		File dest = new File("c:\\temp\\back.jpg");
		
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
//		Buffer
		byte[] buf = new byte[1024 * 10];	// 10kB 공간생성
		
		try {
			fi = new FileInputStream(src);	// 원본 이미지
			fo = new FileOutputStream(dest);	// 복사본 이미지
			long startTime = System.nanoTime();	// 현재 시간
//			int c;	// 1 바이트씩 복사 처리한 코드
//			while((c = fi.read()) != -1) {
//				fo.write(c);
//			}
			while(true) {
				int cnt = fi.read(buf);	// return 바이트 수 => cnt
				fo.write(buf, 0, cnt);
				if(cnt < buf.length) {	// true => 마지막 데이터
					break;
				}
			}
			long endTime = System.nanoTime();
			System.out.println("걸린 시간 : " + (endTime - startTime));
			fi.close();
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
