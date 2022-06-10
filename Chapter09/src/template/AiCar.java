package template;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 전환합니다.");

	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 정지합니다.");

	}

	@Override
	public void wiper() {
		System.out.println("와이퍼가 자동으로 작동됩니다.");		
	}		

	@Override
	public void washCar() {
		System.out.println("차량이 세차됩니다.");		
	} // washCar() 재정의
	
	

}
