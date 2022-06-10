package thisex;

public class BirthDay {
	int Day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}

	public void printThis() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {

	BirthDay b1 = new BirthDay();
	BirthDay b2 = new BirthDay();
	
	System.out.println(b1);		// b1의 주소값 출력
	b1.printThis(); 	// 자기 자신의 주소값 출력
	
	System.out.println(b2);		// b2의 주소값 출력
	b2.printThis(); 	// 자기 자신의 주소값 출력
	
		}

	}
