package array;

public class ArrayTest {

	public static void main(String[] args) {
		
/*		int[] numbers = new int[] {0,1,2};	// �迭 3�� ����, �ʱ�ȭ
		
		System.out.println(numbers.length);		// �迭�� ���� ���
		
*/
		int[] numbers = new int[5];	
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;		// �迭 ���� ����, �� �ϳ��� �Ҵ�, null�� �ʱ�ȭ
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
	}

}
