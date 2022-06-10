package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("알파벳을 여러개 입력하고 Enter를 누르세요");
		int i = 0; 
		try {
			while ((i = System.in.read()) != '\n') {	// 읽어들이는 값이 enter가 아닌 동안
				System.out.print((char)i);		// i(char로 캐스팅)을 출력
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
