package staticex;

public class StudentTest1 {
	
	public static void main(String[] args) {
		
		System.out.println(Student.getSerialNum());		// �ν��Ͻ� ���� ���� �޸� ����
		
		Student studentJ = new Student();
		System.out.println(Student.getSerialNum());		// static ����,�޼ҵ�� Ŭ���� �̸����� ȣ��

		
		Student studentT = new Student();
		System.out.println(studentT.StudentID + "\n");
		
/*		System.out.println(studentJ.serialNum);
		System.out.println(studentT.serialNum);		
		// studentJ�� studentT�� serialNum�� ���� ���� ����Ŵ
*/
		
	}
		
}


