package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
//		Computer c1 = new Computer();		// �߻� Ŭ���� �ν��Ͻ� ���� x
		Computer c2 = new DeskTop();		// ���� Ŭ���� Ÿ������ �ν��Ͻ� ���� o (��ĳ����)
//		Computer c3 = new NoteBook();		
		
		Computer c4 = new MyNoteBook();
		c2.display(); 		// ���� �Լ�, Ÿ�԰� ������� ���� ������ �ν��Ͻ��� �޼ҵ� ȣ��
		c4.display();
		
	}

}
