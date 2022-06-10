package cooperation;

public class Subway {
	
	int lineNum;
	int passengerCount;
	int money;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}		// ½Â°´ÀÌ Å¾½ÂÇÏ¸é ½Â°´ ¼ö Áõ°¡, µ· Áõ°¡

	public void showInfo() {
		System.out.println("ÁöÇÏÃ¶" + lineNum + "¹øÀÇ ½Â°´ ¼ö´Â " + passengerCount + " ¸íÀÌ°í,"
				+ " ¼öÀÔÀº " + money + " ¿ø ÀÔ´Ï´Ù.");
	}

}
