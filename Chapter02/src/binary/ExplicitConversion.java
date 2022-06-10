package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum; // ����� �� ��ȯ
		
		System.out.println(iNum);
		System.out.println(bNum); // ������ ����
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		
		float fNum = 0.9f;
		
		int num1 = (int)dNum + (int)fNum; // 3+0
		int num2 = (int)(dNum + fNum); // 4.23 �� ������ �� ��ȯ
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
