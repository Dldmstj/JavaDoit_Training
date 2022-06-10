package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student std1 = new Student("짱구", 5000);
		Student std2 = new Student("맹구", 10000);		// Student 인스턴스 생성
		
		Bus bus100 = new Bus(100);		// Bus 인스턴스 생성
		std1.takeBus(bus100);
		std1.showInfo();
		bus100.showInfo();
		
		Subway sub1 = new Subway(1); 	// Subway 인스턴스 생성
		std2.takeSubway(sub1);
		std2.showInfo();
		sub1.showInfo();
	}

}
