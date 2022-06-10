package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student std1 = new Student(100, "짱구");
		std1.addSubject("국어", 100);
		std1.addSubject("수학", 90);
		
		std1.showStudentInfo();
		
		System.out.println("\n");
		
		Student std2 = new Student(101, "맹구");
		std2.addSubject("국어", 80);
		std2.addSubject("수학", 100);
		
		std2.showStudentInfo();
		
	}

}
