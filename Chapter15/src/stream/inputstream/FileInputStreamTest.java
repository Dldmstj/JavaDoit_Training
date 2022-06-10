package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		FileReader fis = null;		// 문자 스트림
		int i = 0;
		try {
			fis = new FileReader("input.txt");
			
			while( (i = fis.read()) != -1) {		// file 끝까지 읽어내기
				System.out.print((char)i);				
			}

		}catch(IOException e){
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch (IOException e) {
				System.out.println(e);			
			}
		}
		System.out.println("end");
	}

}
