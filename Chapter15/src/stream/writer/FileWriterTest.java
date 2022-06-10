package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt")) {
			fw.write("A");
			char[] ch = {'B', 'C', 'D'};
			fw.write(ch);
			fw.write("안녕하세요");
			fw.write(ch,1,2);	// 1번째 값부터 2개 출력
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
