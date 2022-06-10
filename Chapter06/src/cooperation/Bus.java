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
	}		// ½Â°´ÀÌ Å¾½ÂÇÏ¸é ½Â°´ ¼ö Áõ°¡, µ· Áõ°¡

	public void showInfo() {
		System.out.println("¹ö½º" + busNum + "¹øÀÇ ½Â°´ ¼ö´Â " + passengerCount + " ¸íÀÌ°í,"
				+ " ¼öÀÔÀº " + money + " ¿ø ÀÔ´Ï´Ù.");
	}
}
