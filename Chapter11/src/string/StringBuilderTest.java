package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1));		// �ν��Ͻ� ó�� �������� ���� �޸� �ּ�
		
		StringBuilder buffer = new StringBuilder(str1);		// String���κ��� StringBuilder ����
		System.out.println(System.identityHashCode(buffer));		// buffer �޸� �ּ�
		
		buffer.append(" and");
		buffer.append(" android");		// ���ڿ� �߰�
		System.out.println(System.identityHashCode(buffer));		// buffer �޸� �ּ�
		
		String str2 = buffer.toString();	// String Ŭ������ ��ȯ
		System.out.println(str2);
	}

}
