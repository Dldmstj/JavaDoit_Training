package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		int len =0;
		
		try(FileInputStream fis = new FileInputStream("a.exe");
				FileOutputStream fos = new FileOutputStream("b.exe");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			millisecond = System.currentTimeMillis();	// 변수 millisecond에 currenttime 저장
			int i;
			while ((i = bis.read()) != -1) {
				bos.write(i);		// a.exe를 b.exe에 복사
				len ++;
			}
			millisecond = System.currentTimeMillis() - millisecond;		
			// 현재 currenttime에서 저장되어있는 값 빼서 millisecond에 저장
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println(len);
		System.out.println(millisecond);
		
	}

}
