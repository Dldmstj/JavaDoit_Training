package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1));		// 인스턴스 처음 생성됐을 때의 메모리 주소
		
		StringBuilder buffer = new StringBuilder(str1);		// String으로부터 StringBuilder 생성
		System.out.println(System.identityHashCode(buffer));		// buffer 메모리 주소
		
		buffer.append(" and");
		buffer.append(" android");		// 문자열 추가
		System.out.println(System.identityHashCode(buffer));		// buffer 메모리 주소
		
		String str2 = buffer.toString();	// String 클래스로 반환
		System.out.println(str2);
	}

}
