package witharraylist;

public class VipCustomer extends Customer {		// Customer.class 를 상속받음
	
	private double saleRatio;
	private int agentID;

	public VipCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName);		
		// 상위 클래스를 가리키는 참조자, 매개변수 없을 때 default constructor 호출
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID =agentID;
		
//		System.out.println("VipCustomer(int, String); 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}		// 메소드 오버라이딩
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 ID는 " + agentID + " 입니다.";		// super 빼면 재귀호출. super로 상위 클래스 상속
	}
	
	
}
