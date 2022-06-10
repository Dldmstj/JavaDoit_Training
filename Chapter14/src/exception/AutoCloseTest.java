package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();	//Exception ¹ß»ý½ÃÅ´
		}catch(Exception e) {
			System.out.println("exception()");
		}
	}

}
