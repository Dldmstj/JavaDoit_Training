package exception;

public class UserDefineTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws UserDefineException{
		if(userID == null) {
			throw new UserDefineException("���̵�� null�� �� �� �����ϴ�");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new UserDefineException("���̵�� 8�� �̻�, 20�� ���Ϸ� �ۼ��Ͻʽÿ�.");
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
