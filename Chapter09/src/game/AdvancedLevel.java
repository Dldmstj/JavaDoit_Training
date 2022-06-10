package game;

public class AdvancedLevel extends PlayerLevel{
	
	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높게 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn 기능을 사용할 수 없습니다.");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("Advanced 레벨입니다.");
	}

}
