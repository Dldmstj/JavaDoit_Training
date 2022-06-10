package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1,num2); 	// addNum 함수 호출
		System.out.println(sum);		// 결과 출력
	
	}
	
	public static int addNum(int n1, int n2) { 		// 반환타입 함수이름 (매개변수1, 매개변수2)
		int result = n1 + n2;
		return result;			// 반환 값
	}

}
