package privateexample;

public class StudentTest {
	
	public static void main(String[] args){
	
		Student std1 = new Student();
		std1.setNum(100);
		std1.setName("¯��");
		
		Student std2 = new Student();
		std2.setNum(101);
		std2.setName("�ͱ�");
		
		Student std3 = new Student();
		std3.setNum(102);
		std3.setName("ö��");
		
		Student std4 = new Student();
		std4.setNum(103);
		std4.setName("����");
		
		Student std5 = new Student();
		std5.setNum(104);
		std5.setName("����");
		
		std1.showStudentInfo();
		std2.showStudentInfo();
		std3.showStudentInfo();
		std4.showStudentInfo();
		std5.showStudentInfo();
		
	}
}
