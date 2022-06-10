package interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Sell");
	}

	@Override
	public void buy() {
		System.out.println("Buy");	
	}
	
	@Override
	public void order() {
		System.out.println(" 고객 판매 주문");
	}

}
