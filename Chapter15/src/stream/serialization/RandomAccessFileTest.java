package stream.serialization;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);	// 4byte
		System.out.println(rf.getFilePointer());
		
		rf.seek(0); 	// file pointer 맨 앞으로 이동
		int i = rf.readInt();
		
		System.out.println(i);	
	}
	

}
