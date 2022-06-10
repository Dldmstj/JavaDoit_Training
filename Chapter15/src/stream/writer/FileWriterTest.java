package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt")) {
			fw.write("A");
			char[] ch = {'B', 'C', 'D'};
			fw.write(ch);
			fw.write("�ȳ��ϼ���");
			fw.write(ch,1,2);	// 1��° ������ 2�� ���
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
