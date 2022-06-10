package customerex;

public class OverrindingTest {

	public static void main(String[] args) {
		
		Customer cus1 = new Customer(101, "짱구");
		cus1.calcPrice(10000);
		System.out.println(cus1.showCustomerInfo());
		
		VipCustomer vcus1 = new VipCustomer(102, "맹구", 1);
		vcus1.calcPrice(10000);
		System.out.println(vcus1.showCustomerInfo());
		
		System.out.println("\n");
		
		Customer vcus2 = new VipCustomer(103, "철수", 2);
		vcus2.calcPrice(10000);			// 가상 함수, 하위 클래스의 calPrice() 메소드 호출됨
		System.out.println(vcus2.showCustomerInfo());
	}

}
