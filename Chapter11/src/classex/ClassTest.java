package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass();		// getClass()�� Objerct�� �޼ҵ�, Class Ŭ������ ��ȯ��

		System.out.println(pClass1.getName());		// Person Ŭ������ �̸� ��ȯ
		
		Class pClass2 = Person.class;
	
		System.out.println(pClass2.getName());	
		
		Class pClass3 = Class.forName("classex.Person");
		
		System.out.println(pClass3.getName());
		
	}

}
