package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		char[] alphabet = new char[26];
		char ch = 'A';	//65
		
		for(int i = 0; i < alphabet.length; i++, ch++) {	// i�� �迭�� ���̺��� �������� i����, ch����
			alphabet[i] = ch;
			System.out.println(alphabet[i]);
		}

	}

}
