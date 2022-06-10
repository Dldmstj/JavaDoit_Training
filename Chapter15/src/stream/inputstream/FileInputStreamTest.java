package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		FileReader fis = null;		// ���� ��Ʈ��
		int i = 0;
		try {
			fis = new FileReader("input.txt");
			
			while( (i = fis.read()) != -1) {		// file ������ �о��
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