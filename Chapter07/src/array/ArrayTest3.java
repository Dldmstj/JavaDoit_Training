package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		char[] alphabet = new char[26];
		char ch = 'A';	//65
		
		for(int i = 0; i < alphabet.length; i++, ch++) {	// i가 배열의 길이보다 작은동안 i증가, ch증가
			alphabet[i] = ch;
			System.out.println(alphabet[i]);
		}

	}

}
