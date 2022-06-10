package staticex;

public class Student {
	
	private static int serialNum = 10000;

	int StudentID;
	String studentName;

	public Student() {
		serialNum++;
		StudentID = serialNum;
	}
	
	public static int getSerialNum() {		// static 메소드에서는 인스턴스 변수를 쓸 수 없음
		int i = 10; 	// 지역변수
		
//		StudentName = "홍길동"; 	// 멤버 변수, 사용할 수 없다
		
		return serialNum;		// static 변수
	}		// 값을 가져 올 수만 있음

}
