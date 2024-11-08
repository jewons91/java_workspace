package sampleproject.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestMain {

	public static void main(String[] args) {
		File src = new File("c:\\temp\\img.jpg");
		File dest = new File("c:\\temp\\back.jpg");
		
		byte[] buf = new byte[1024 * 10];
		
		try(FileInputStream fi = new FileInputStream(src);
				FileOutputStream fo = new FileOutputStream(dest)) {
			long startTime = System.nanoTime();
			
			while(true) {
				int cnt = fi.read(buf);
				fo.write(buf,0,cnt);
				if(cnt < buf.length) {
					break;
				}
			}
			long endTime = System.nanoTime();
			System.out.println("걸린 시간 : " + (endTime - startTime));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
