package array;

public class TowDimensionArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length);		
		System.out.println(arr[0].length); 		// 0 행의 열 개수
		
		System.out.println("\n");
		
		for(int i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);		// 0,0 ~ 0,2 까지 출력, 1,0 ~ 1,2 까지 출력 ...
			}
		}
	}

}
