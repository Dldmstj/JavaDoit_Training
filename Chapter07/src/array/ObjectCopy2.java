package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
/*		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
	
		bookArray1[0] = new Book("�¹���1", "������");
		bookArray1[1] = new Book("�¹���2", "������");
		bookArray1[2] = new Book("�¹���3", "������");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();		// �ν��Ͻ� ���� ����
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			
		}		// ���� ����, array1�� ��� �ٲ㵵 ���� ��ġ�� ����
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		System.out.println("\n");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("\n");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}		
		
*/
		
		// ���� for ��
		
		String[] strArr = {"Java", "Android", "c"};
		
		for(String s : strArr) {	
			System.out.println(s);
		}
	
	}

}