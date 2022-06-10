package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address; 	// 멤버 변수
	
	public Student() {}		// 디폴트 생성자
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		
	}	// 생성자
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); 	// 메소드
	}
	
	public String getStudentName() {		// studentName을 반환하는 함수
		return studentName;
		
	}
	
	public void setStudentName(String name) {		// studentName 을 바꾸는 함수
		studentName = name;
	}
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이순신");		// 참조변수 studentLee 를 힙 메모리에 생성

		studentLee.address = "서울시";
		
		Student studentKim = new Student();		// 참조변수 studentKim 을 힙 메모리에 생성
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
