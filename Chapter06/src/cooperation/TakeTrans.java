package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student std1 = new Student("¯��", 5000);
		Student std2 = new Student("�ͱ�", 10000);		// Student �ν��Ͻ� ����
		
		Bus bus100 = new Bus(100);		// Bus �ν��Ͻ� ����
		std1.takeBus(bus100);
		std1.showInfo();
		bus100.showInfo();
		
		Subway sub1 = new Subway(1); 	// Subway �ν��Ͻ� ����
		std2.takeSubway(sub1);
		std2.showInfo();
		sub1.showInfo();
	}

}
