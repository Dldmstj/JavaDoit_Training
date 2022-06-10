package exception;

public class UserDefineException extends Exception{
	
	public UserDefineException(String message) {
		super(message);
	} // 전달받은 ID가 null 이거나 8자 이하, 20자 이상인 경우 예외를 발생시키는 예제

}
