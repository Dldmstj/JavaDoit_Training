package customerex;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;		// protected : 다른 패키지, 하위 클래스에서 사용 가능
	int bonusPoint;
	double bonusRatio;		// 포인트 적립 비율
	
/*	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
		
		System.out.println("Customer(); 호출");
	}
*/
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
		
//		System.out.println("Customer(int,String); 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}		// 포인트 적립하는 메소드
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + " 입니다."; 
	}		// 고객 정보 보여주는 메소드

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
