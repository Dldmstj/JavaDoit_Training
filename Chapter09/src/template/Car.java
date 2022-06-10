package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	public void washCar() {}		// 구현 메소드, 필요에 의해 재정의
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
		
	}
	
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}		// 템플릿 메소드, 하위 클래스에서 재정의 할 수 x
}
