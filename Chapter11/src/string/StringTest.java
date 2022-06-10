package string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		String str2 = new String("android");
		
		System.out.println(System.identityHashCode(str1));		// str1의 주소값 출력
		
		str1 = str1.concat(str2);		// java + android 가 연결된 문자열이 새로 생성

		System.out.println(System.identityHashCode(str1));		// 새로 생성된 문자열의 주소를 가리킴
		
		System.out.println(str1);
		

		
	}

}
