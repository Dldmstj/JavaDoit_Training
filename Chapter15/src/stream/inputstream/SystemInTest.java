package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("���ĺ��� ������ �Է��ϰ� Enter�� ��������");
		int i = 0; 
		try {
			while ((i = System.in.read()) != '\n') {	// �о���̴� ���� enter�� �ƴ� ����
				System.out.print((char)i);		// i(char�� ĳ����)�� ���
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
