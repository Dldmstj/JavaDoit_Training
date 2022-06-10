package object;


class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {

		if( obj instanceof Student) {
			Student std = (Student)obj;		// Student로 다운캐스팅
			
			if(this.studentID == std.studentID) {
				return true;
			}
			else return false;		// studentID 다를 경우 false
		}
		return  false;		// 인스턴스가 Student가 아닌 경우 false
	}
	
	public int hashCode() {
		return studentID;		// studentID를 출력하도록 hashCode() 재정의
	}
	

}


public class EqualsEX {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
//		System.out.println(str1 == str2);		// 인스턴스 주소 값 비교
//		System.out.println(str1.equals(str2));	// 문자열 비교
		
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));		//false, 원래의 equals는 == 의 의미
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());		// 해시코드 메소드가 String 클래스에서 재정의되어있음
		
	}

}
