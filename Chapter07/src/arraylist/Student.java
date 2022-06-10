package arraylist;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;		// �л��� �����ϴ� ���� ArrayList�� ����
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {		// ���� �߰� �޼ҵ�
		
		Subject subject = new Subject();		// subject �ν��Ͻ� ����
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);				// subjectList�� subject �߰�
	}
	
	public void showStudentInfo() {
		
		for( Subject sub : subjectList) {
			System.out.println("�л� " + studentName + "���� " + sub.getName() + " ������ ������ " 
					+ sub.getScore() + " �� �Դϴ�.");
		}
		
	}
}
