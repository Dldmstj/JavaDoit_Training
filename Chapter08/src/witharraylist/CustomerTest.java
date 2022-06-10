package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();		// ArrayList
		
		Customer cus1 = new Customer(100, "¯��");
		Customer cus2 = new Customer(101, "�ͱ�");
		GoldCustomer gcus1 = new GoldCustomer(102, "ö��");
		GoldCustomer gcus2 = new GoldCustomer(103, "����");
		VipCustomer vcus1 = new VipCustomer(104, "����",1);
		
		customerList.add(cus1);
		customerList.add(cus2);
		customerList.add(gcus1);
		customerList.add(gcus2);
		customerList.add(vcus1);
		
		System.out.println("<< �� ���� >>");
		
		for(Customer c : customerList) {		// ���� for ��
			System.out.println(c.showCustomerInfo());		// Customer.class �� �޼ҵ� ȣ��
		}
		
		System.out.println("\n << ������, ���ʽ� ����Ʈ >>");
		
		int price = 10000;
		
		for(Customer c : customerList) {		// ���� for ��
			
			int cost = c.calcPrice(price);
			
			System.out.println(c.getCustomerName() + " ����" + cost + " ���� �����ϼ̽��ϴ�.");
			System.out.println(c.getCustomerName() + " ���� ���ʽ� ����Ʈ��" + c.bonusPoint + " �� �Դϴ�.");
		}
		
	}

}
