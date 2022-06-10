package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address; 	// ��� ����
	
	public Student() {}		// ����Ʈ ������
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		
	}	// ������
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); 	// �޼ҵ�
	}
	
	public String getStudentName() {		// studentName�� ��ȯ�ϴ� �Լ�
		return studentName;
		
	}
	
	public void setStudentName(String name) {		// studentName �� �ٲٴ� �Լ�
		studentName = name;
	}
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "�̼���");		// �������� studentLee �� �� �޸𸮿� ����

		studentLee.address = "�����";
		
		Student studentKim = new Student();		// �������� studentKim �� �� �޸𸮿� ����
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "�̱�";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
