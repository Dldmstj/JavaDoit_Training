package staticex;

public class StudentTest1 {
	
	public static void main(String[] args) {
		
		System.out.println(Student.getSerialNum());		// 인스턴스 생성 전에 메모리 잡힘
		
		Student studentJ = new Student();
		System.out.println(Student.getSerialNum());		// static 변수,메소드는 클래스 이름으로 호출

		
		Student studentT = new Student();
		System.out.println(studentT.StudentID + "\n");
		
/*		System.out.println(studentJ.serialNum);
		System.out.println(studentT.serialNum);		
		// studentJ와 studentT의 serialNum은 같은 값을 가리킴
*/
		
	}
		
}


