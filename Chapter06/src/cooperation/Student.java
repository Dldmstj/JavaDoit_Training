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
		bus.take(1000); 	// Bus ��ü�� �޼ҵ带 ȣ��
		money -= 1000;
		
	} // ��ü�� ����

	public void takeSubway(Subway sub) {
		sub.take(1000); 	// Subway ��ü�� �޼ҵ带 ȣ��
		money -= 1000;
		
	} // ��ü�� ����
	
	public void showInfo() {
		System.out.println(studentName + " ���� �ܾ��� " + money + " �Դϴ�.");
	}
}
