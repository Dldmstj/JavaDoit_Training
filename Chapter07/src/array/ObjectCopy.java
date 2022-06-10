package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
	
		bookArray1[0] = new Book("�¹���1", "������");
		bookArray1[1] = new Book("�¹���2", "������");
		bookArray1[2] = new Book("�¹���3", "������");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		// arraycopy(������ �迭, ���� ���� ��ġ, 	��� �迭, �ٿ����� ù ��ġ, ������ ����)
		
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
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
		// ���� ����, �迭 ����� �ּҸ� ����, �迭 ��Ұ� ����Ǹ� ����� �迭�� ���� ����
	}

}
