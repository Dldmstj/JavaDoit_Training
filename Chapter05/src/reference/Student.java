package reference;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;		// ���� �ڷ���
	
	public Student() {
		korea = new Subject("����");
		math = new Subject("����");	
	}		// ���� �ν��Ͻ� ����
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject("����");
		math = new Subject("����");	
	}		// �����ε�
	
	public void setKorea(int score) {
		korea.setScore(score);
		
	}
	public void setMath(int score) {
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " �л��� ������ " + total + " �� �Դϴ�.");
	}
}
