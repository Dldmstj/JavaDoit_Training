package interfaceex;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;			// �ƹ��� Ű���� ���� �ʾƵ� public static final �����

	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// �������̽� Ű���� �ȿ� ����Ǹ� �߻� �޼ҵ尡 ��
	
	default void description() {
		System.out.println("���� ��ѱ⸦ �����մϴ�.");
	}
}