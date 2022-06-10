package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		try {
			for( int i=0; i<=5; i++ ) {		// 오류 발생, 배열의 범위 넘어감
					System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);		// try{} 수행하는 동안 error 발생시 catch{}로 넘어감
			return;		// finally{} 수행된 다음 return 수행, "end"출력 안됨
		}finally {		// try{}가 수행되면 무조건 수행되는 블록
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
