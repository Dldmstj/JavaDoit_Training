package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		while(true) {
			sum += num;
			
			if(sum >100) // sum이 100보다 크면 break, num 증가하지 않음
				break;
			num++; 
			
		}
		System.out.println(sum);
		System.out.println(num);
		
	}

}
