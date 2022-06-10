package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass();		// getClass()는 Objerct의 메소드, Class 클래스를 반환함

		System.out.println(pClass1.getName());		// Person 클래스의 이름 반환
		
		Class pClass2 = Person.class;
	
		System.out.println(pClass2.getName());	
		
		Class pClass3 = Class.forName("classex.Person");
		
		System.out.println(pClass3.getName());
		
	}

}
