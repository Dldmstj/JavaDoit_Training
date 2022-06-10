package reference;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;		// 참조 자료형
	
	public Student() {
		korea = new Subject("국어");
		math = new Subject("수학");	
	}		// 과목 인스턴스 생성
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject("국어");
		math = new Subject("수학");	
	}		// 오버로딩
	
	public void setKorea(int score) {
		korea.setScore(score);
		
	}
	public void setMath(int score) {
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " 학생의 총점은 " + total + " 점 입니다.");
	}
}
