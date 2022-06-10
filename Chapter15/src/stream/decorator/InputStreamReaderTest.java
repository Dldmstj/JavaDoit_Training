package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	
	public static void main(String[] args) {
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt") )) {
			// 보조스트림 (기반스트림) -> 읽어낼 때 문자로 변환하여 읽어냄
			
			int i = 0;
			while ((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

	
}
