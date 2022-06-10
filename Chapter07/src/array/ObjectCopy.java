package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
	
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		// arraycopy(복사할 배열, 복사 시작 위치, 	대상 배열, 붙여넣을 첫 위치, 복사요소 개수)
		
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("\n");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("\n");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}		
		// 얕은 복사, 배열 요소의 주소만 복사, 배열 요소가 변경되면 복사된 배열의 값도 변경
	}

}
