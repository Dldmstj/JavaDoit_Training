package binary;
public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum =10;
		float fNum = lNum; // �� ��ȯ
		
		System.out.println(fNum);
		
		double dNum = fNum + num; // ������ �� ��ȯ
		System.out.println(dNum);
	}

}
