package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] num = new double[5];
		int size = 0;		// size 선언
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size ++;
		num[2] = 30.0; size ++;		// 배열에 자료가 들어갈 때마다 size 증가
		
		double total = 1;
		for(int i = 0; i < size; i++) {	
			total *= num[i];		// i가 size 보다 작을 때까지 곱함
		}
		System.out.println(total);
	}

}
