package staticex;

public class Student {
	
	private static int serialNum = 10000;

	int StudentID;
	String studentName;

	public Student() {
		serialNum++;
		StudentID = serialNum;
	}
	
	public static int getSerialNum() {		// static �޼ҵ忡���� �ν��Ͻ� ������ �� �� ����
		int i = 10; 	// ��������
		
//		StudentName = "ȫ�浿"; 	// ��� ����, ����� �� ����
		
		return serialNum;		// static ����
	}		// ���� ���� �� ���� ����

}
