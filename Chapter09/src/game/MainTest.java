package game;

public class MainTest {

	public static void main(String[] args) {
		
		Player p1 = new Player();		// player �ν��Ͻ� ����
		p1.play(1);
		
		System.out.println("\n");
		
		AdvancedLevel aLevel = new AdvancedLevel();		// AdvancedLevel �ν��Ͻ� ����
		p1.upgradeLevel(aLevel);		
		p1.play(2);
		
		System.out.println("\n");
		
		SuperLevel sLevel = new SuperLevel();
		p1.upgradeLevel(sLevel);
		p1.play(3);
		
	}

}
