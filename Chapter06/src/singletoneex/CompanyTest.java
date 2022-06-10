package singletoneex;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getCompany();
		
		Company c2 = Company.getCompany();
		
		System.out.println(c1);
		System.out.println(c2);		// 주소 동일, c1,c2는 같은 인스턴스 가리킴
		
	}

}
