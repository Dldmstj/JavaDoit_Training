package customerex;

public class VipCustomer extends Customer {		// Customer.class �� ��ӹ���
	
	private double saleRatio;
	private int agentID;

	public VipCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName);		
		// ���� Ŭ������ ����Ű�� ������, �Ű����� ���� �� default constructor ȣ��
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID =agentID;
		
//		System.out.println("VipCustomer(int, String); ȣ��");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}		// �޼ҵ� �������̵�
	
	public int getAgentID() {
		return agentID;
	}
}
