package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
//		this.grade = grade;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000); 	// Bus °´Ã¼ÀÇ ¸Þ¼Òµå¸¦ È£Ãâ
		money -= 1000;
		
	} // °´Ã¼ÀÇ Çù¾÷

	public void takeSubway(Subway sub) {
		sub.take(1000); 	// Subway °´Ã¼ÀÇ ¸Þ¼Òµå¸¦ È£Ãâ
		money -= 1000;
		
	} // °´Ã¼ÀÇ Çù¾÷
	
	public void showInfo() {
		System.out.println(studentName + " ´ÔÀÇ ÀÜ¾×Àº " + money + " ÀÔ´Ï´Ù.");
	}
}
