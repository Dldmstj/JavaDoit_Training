package interfaceex;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;			// 아무런 키워드 쓰지 않아도 public static final 선언됨

	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 인터페이스 키워드 안에 선언되면 추상 메소드가 됨
	
	default void description() {
		System.out.println("정적 계싼기를 구현합니다.");
	}
}
