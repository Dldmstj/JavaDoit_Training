package customerex;

public class CustomerTest {

	public static void main(String[] args) {
		
/*		Customer cus1 = new Customer();
		cus1.setCustomerID(100);
		cus1.setCustomerName("짱구");
*/		
		
		VipCustomer vcus1 = new VipCustomer(101,"맹구",1);
		
		// Customer.class 상속, Customer에 선언된 메소드 사용 가능
		
//		System.out.println(cus1.showCustomerInfo());
		System.out.println(vcus1.showCustomerInfo());
	}

}
