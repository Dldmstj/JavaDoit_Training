package singletoneex;

public class Company {
	
	private static Company company = new Company();		// private, 외부에서 인스턴스 호출할 수 없음
	
	private Company() {}	// 외부에서 Company 생성자를 호출할 수 없음
	
	
	public static Company getCompany() {		// static으로 선언, 외부에서 객체를 생성하지 않고 인스턴스 사용 가능
		return company;
	}		// private 인스턴스 객체를 외부에서 사용 가능하게 하는 메소드

}
