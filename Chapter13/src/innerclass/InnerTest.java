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
//		static sInNum = 100;	// innerClass 내에서 Static 변수, 메소드 사용할 수 없음
		
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
			// num += 10; 	// 외부 클래스의 인스턴스 변수는 사용할 수 없음
			sNum += 10;		// static 변수이므로 static 클래스 내에서 사용 가능
			
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {	// 인스턴스 생성과 상관 없이 사용할 수 있는 메소드
			System.out.println(sNum);
//			System.out.println(iNum);	// static 변수만 사용할 수 있음
			System.out.println(sInNum);
			
		}

	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass.InStaticClass.sTest();		// 인스턴스 생성과 상관없이 호출되어 사용가능
	}

}
