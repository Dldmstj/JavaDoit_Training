package customerex;

public class OverrindingTest {

	public static void main(String[] args) {
		
		Customer cus1 = new Customer(101, "¯��");
		cus1.calcPrice(10000);
		System.out.println(cus1.showCustomerInfo());
		
		VipCustomer vcus1 = new VipCustomer(102, "�ͱ�", 1);
		vcus1.calcPrice(10000);
		System.out.println(vcus1.showCustomerInfo());
		
		System.out.println("\n");
		
		Customer vcus2 = new VipCustomer(103, "ö��", 2);
		vcus2.calcPrice(10000);			// ���� �Լ�, ���� Ŭ������ calPrice() �޼ҵ� ȣ���
		System.out.println(vcus2.showCustomerInfo());
	}

}
