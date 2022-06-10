package privateexample;

public class StudentTest {
	
	public static void main(String[] args){
	
		Student std1 = new Student();
		std1.setNum(100);
		std1.setName("Â¯±¸");
		
		Student std2 = new Student();
		std2.setNum(101);
		std2.setName("¸Í±¸");
		
		Student std3 = new Student();
		std3.setNum(102);
		std3.setName("Ã¶¼ö");
		
		Student std4 = new Student();
		std4.setNum(103);
		std4.setName("À¯¸®");
		
		Student std5 = new Student();
		std5.setNum(104);
		std5.setName("ÈÆÀÌ");
		
		std1.showStudentInfo();
		std2.showStudentInfo();
		std3.showStudentInfo();
		std4.showStudentInfo();
		std5.showStudentInfo();
		
	}
}
