package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
//		Computer c1 = new Computer();		// 추상 클래스 인스턴스 생성 x
		Computer c2 = new DeskTop();		// 상위 클래스 타입으로 인스턴스 생성 o (업캐스팅)
//		Computer c3 = new NoteBook();		
		
		Computer c4 = new MyNoteBook();
		c2.display(); 		// 가상 함수, 타입과 상관없이 실제 생성된 인스턴스의 메소드 호출
		c4.display();
		
	}

}
