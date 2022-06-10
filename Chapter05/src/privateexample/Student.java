package privateexample;

public class Student {
	
	private int num;
	private String name;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println("학번: " + getNum() + " , 이름: " + getName() );
	}
	
}
