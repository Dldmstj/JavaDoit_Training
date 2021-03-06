package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			// true -> 뒤에 연결해서 출력
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
