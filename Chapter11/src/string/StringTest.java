package string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		String str2 = new String("android");
		
		System.out.println(System.identityHashCode(str1));		// str1�� �ּҰ� ���
		
		str1 = str1.concat(str2);		// java + android �� ����� ���ڿ��� ���� ����

		System.out.println(System.identityHashCode(str1));		// ���� ������ ���ڿ��� �ּҸ� ����Ŵ
		
		System.out.println(str1);
		

		
	}

}
