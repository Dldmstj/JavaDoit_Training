package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student std1 = new Student(100, "¯��");
		std1.addSubject("����", 100);
		std1.addSubject("����", 90);
		
		std1.showStudentInfo();
		
		System.out.println("\n");
		
		Student std2 = new Student(101, "�ͱ�");
		std2.addSubject("����", 80);
		std2.addSubject("����", 100);
		
		std2.showStudentInfo();
		
	}

}
