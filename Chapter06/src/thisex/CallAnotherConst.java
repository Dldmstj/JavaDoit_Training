package thisex;

class Person {
	
	String name;
	int age;
	
	public Person() {
		this("�̸�����", 1);
	}
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public Person returnSelf () {	
		return this;
	}		// ���� Ÿ���� �ڱ� �ڽ� Ŭ���� ������ �ϰ� return this -> ���� ���� �ν��Ͻ� �ּ�
}

public class CallAnotherConst {
	

	public static void main(String[] args) {
		
		 Person p1 = new Person();		// �Ű����� �����Ƿ� public Person() {} ������ ȣ���
		 System.out.println(p1.name);
		 
		System.out.println(p1.returnSelf()); 	// �ν��Ͻ� �ּ� �� ��ȯ
	}

}
