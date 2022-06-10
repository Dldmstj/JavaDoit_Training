package interfaceex;

public class MyClass implements X, Y, MyInterface{

	@Override
	public void myMethod() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void x() {
		System.out.println("myMehod()");		
	}
	
	public static void main(String args) {
		
		MyClass myClass = new MyClass();
		myClass.x();
		myClass.y();
		myClass.myMethod();
		
		X x = new MyClass();
		x.x();
	}

}
