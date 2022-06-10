package innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	
	public OutClass (){
		inClass = new InClass();
	}
	
	private class InClass{
		int inNum = 200;
//		static sInNum = 100;	// innerClass ������ Static ����, �޼ҵ� ����� �� ����
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;

		void inTest() {
			// num += 10; 	// �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			sNum += 10;		// static �����̹Ƿ� static Ŭ���� ������ ��� ����
			
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {	// �ν��Ͻ� ������ ��� ���� ����� �� �ִ� �޼ҵ�
			System.out.println(sNum);
//			System.out.println(iNum);	// static ������ ����� �� ����
			System.out.println(sInNum);
			
		}

	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass.InStaticClass.sTest();		// �ν��Ͻ� ������ ������� ȣ��Ǿ� ��밡��
	}

}