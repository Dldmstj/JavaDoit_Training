package game;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 기능을 사용할 수 없습니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn 기능을 사용할 수 없습니다.");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("Beginner 레벨입니다.");
	}

}
