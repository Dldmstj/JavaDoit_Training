package customerex;

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
		return price;
	}		// 메소드 오버라이딩
	
	public int getAgentID() {
		return agentID;
	}
}
