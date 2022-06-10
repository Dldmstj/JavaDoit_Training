package array;

public class ArrayTest {

	public static void main(String[] args) {
		
/*		int[] numbers = new int[] {0,1,2};	// 배열 3개 생성, 초기화
		
		System.out.println(numbers.length);		// 배열의 길이 출력
		
*/
		int[] numbers = new int[5];	
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;		// 배열 길이 선언, 값 하나씩 할당, null로 초기화
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
	}

}
