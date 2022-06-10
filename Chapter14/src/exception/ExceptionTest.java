package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
	// file 읽어들이는 stream
		try (FileInputStream fis = new FileInputStream("a.txt")) {
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
