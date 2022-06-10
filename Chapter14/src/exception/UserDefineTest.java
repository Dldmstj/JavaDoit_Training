package exception;

public class UserDefineTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws UserDefineException{
		if(userID == null) {
			throw new UserDefineException("아이디는 null이 될 수 없습니다");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new UserDefineException("아이디는 8자 이상, 20자 이하로 작성하십시오.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {

		UserDefineTest udTest = new UserDefineTest();
		String userID = null;
		
		try {
			udTest.setUserID(userID);
		}catch (UserDefineException e) {
			System.out.println(e);
		}
		
		userID = "1234567";
		try {
			udTest.setUserID(userID);
		}catch (UserDefineException e) {
			System.out.println(e);
		}
	}

}
