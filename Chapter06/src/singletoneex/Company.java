package singletoneex;

public class Company {
	
	private static Company company = new Company();		// private, �ܺο��� �ν��Ͻ� ȣ���� �� ����
	
	private Company() {}	// �ܺο��� Company �����ڸ� ȣ���� �� ����
	
	
	public static Company getCompany() {		// static���� ����, �ܺο��� ��ü�� �������� �ʰ� �ν��Ͻ� ��� ����
		return company;
	}		// private �ν��Ͻ� ��ü�� �ܺο��� ��� �����ϰ� �ϴ� �޼ҵ�

}
