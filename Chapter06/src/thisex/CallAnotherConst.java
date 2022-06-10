package thisex;

class Person {
	
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public Person returnSelf () {	
		return this;
	}		// 리턴 타입을 자기 자신 클래스 명으로 하고 return this -> 리턴 값은 인스턴스 주소
}

public class CallAnotherConst {
	

	public static void main(String[] args) {
		
		 Person p1 = new Person();		// 매개변수 없으므로 public Person() {} 생성자 호출됨
		 System.out.println(p1.name);
		 
		System.out.println(p1.returnSelf()); 	// 인스턴스 주소 값 반환
	}

}
