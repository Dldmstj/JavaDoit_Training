package customerex;

public class CustomerTest {

	public static void main(String[] args) {
		
/*		Customer cus1 = new Customer();
		cus1.setCustomerID(100);
		cus1.setCustomerName("¯��");
*/		
		
		VipCustomer vcus1 = new VipCustomer(101,"�ͱ�",1);
		
		// Customer.class ���, Customer�� ����� �޼ҵ� ��� ����
		
//		System.out.println(cus1.showCustomerInfo());
		System.out.println(vcus1.showCustomerInfo());
	}

}
