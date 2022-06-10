package game;

public class SuperLevel extends PlayerLevel {
	
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
		System.out.println("빠르게 turn 합니다.");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("super 레벨입니다.");
	}

}
