package object;

class Book{
	String title;
	String auther;
	
	Book(String title, String auther) {
		this.title = title;
		this.auther = auther;
	}

	@Override
	public String toString() {		// toString 재정의
		return title + " , " + auther;
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		
		Book book = new Book("두잇 자바", "박은종");
		System.out.println(book);		// 인스턴스 주소 값 출력

		String str = new String("test");	// String 클래스에 이미 toStirng이 재정의 되어있음
		System.out.println(str);
	}

}
