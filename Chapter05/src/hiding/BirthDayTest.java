package hiding;

class BirthDay {
	
	private int day;
	private int month;
	private int year;		// private 접근 제어자 : 같은 클래스 내에서만 접근 가능
	
	
	public int getDay() {	// getter, setter
		return day;
	}
	public void setDay(int day) {
		
		if(month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("날짜 오류입니다.");
			}
		}
		else {
			this.day = day;
		}

	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}

public class BirthDayTest{
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2010);
	}
	
}
