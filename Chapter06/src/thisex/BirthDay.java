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
	
	System.out.println(b1);		// b1�� �ּҰ� ���
	b1.printThis(); 	// �ڱ� �ڽ��� �ּҰ� ���
	
	System.out.println(b2);		// b2�� �ּҰ� ���
	b2.printThis(); 	// �ڱ� �ڽ��� �ּҰ� ���
	
		}

	}
