package cooperation;

public class Bus {
	
	int busNum;
	int passengerCount;
	int money;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}		// �°��� ž���ϸ� �°� �� ����, �� ����

	public void showInfo() {
		System.out.println("����" + busNum + "���� �°� ���� " + passengerCount + " ���̰�,"
				+ " ������ " + money + " �� �Դϴ�.");
	}
}
