package object;

class Book{
	String title;
	String auther;
	
	Book(String title, String auther) {
		this.title = title;
		this.auther = auther;
	}

	@Override
	public String toString() {		// toString ������
		return title + " , " + auther;
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		
		Book book = new Book("���� �ڹ�", "������");
		System.out.println(book);		// �ν��Ͻ� �ּ� �� ���

		String str = new String("test");	// String Ŭ������ �̹� toStirng�� ������ �Ǿ�����
		System.out.println(str);
	}

}
