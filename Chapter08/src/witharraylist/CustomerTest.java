package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();		// ArrayList
		
		Customer cus1 = new Customer(100, "짱구");
		Customer cus2 = new Customer(101, "맹구");
		GoldCustomer gcus1 = new GoldCustomer(102, "철수");
		GoldCustomer gcus2 = new GoldCustomer(103, "유리");
		VipCustomer vcus1 = new VipCustomer(104, "훈이",1);
		
		customerList.add(cus1);
		customerList.add(cus2);
		customerList.add(gcus1);
		customerList.add(gcus2);
		customerList.add(vcus1);
		
		System.out.println("<< 고객 정보 >>");
		
		for(Customer c : customerList) {		// 향상된 for 문
			System.out.println(c.showCustomerInfo());		// Customer.class 의 메소드 호출
		}
		
		System.out.println("\n << 할인율, 보너스 포인트 >>");
		
		int price = 10000;
		
		for(Customer c : customerList) {		// 향상된 for 문
			
			int cost = c.calcPrice(price);
			
			System.out.println(c.getCustomerName() + " 님이" + cost + " 원을 지불하셨습니다.");
			System.out.println(c.getCustomerName() + " 님의 보너스 포인트는" + c.bonusPoint + " 원 입니다.");
		}
		
	}

}
