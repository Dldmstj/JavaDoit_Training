package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
/*		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
	
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();		// 인스턴스 따로 생성
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			
		}		// 깊은 복사, array1의 요소 바꿔도 영향 미치지 않음
		
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
		
*/
		
		// 향상된 for 문
		
		String[] strArr = {"Java", "Android", "c"};
		
		for(String s : strArr) {	
			System.out.println(s);
		}
	
	}

}