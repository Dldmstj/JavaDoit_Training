package arraylist;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;		// 학생이 수강하는 과목 ArrayList로 선언
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {		// 과목 추가 메소드
		
		Subject subject = new Subject();		// subject 인스턴스 생성
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);				// subjectList에 subject 추가
	}
	
	public void showStudentInfo() {
		
		for( Subject sub : subjectList) {
			System.out.println("학생 " + studentName + "님의 " + sub.getName() + " 과목의 성적은 " 
					+ sub.getScore() + " 점 입니다.");
		}
		
	}
}
