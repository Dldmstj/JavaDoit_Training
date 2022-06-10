package abstractex;

public abstract class Computer {
	
	public abstract void display();		// 선언만 함. 메소드 이름, 매개변수
	public abstract void typing();

//	public abstract int add(int x, int y);
	
	public void turnOn() {
		System.out.println("turn on");
	}
	
	public void turnOff() {
		System.out.println("turn off");
		}
	
}		// 두 개의 추상 메소드, 두 개의 구현 메소드가 있는 클래스
