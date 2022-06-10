package stream.others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();		// 한 줄을 읽어냄
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(num);
		
	}

}
