package customerex;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("����� �մϴ�.");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void flying() {
		System.out.println("�ϴ��� ���ư��ϴ�.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
//		Animal a = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		
	}
	
	public void moveAnimal(Animal animal) {		// �Ű� ������ �ڷ����� ���� Ŭ����
		
		animal.move();		// �����ǵ� �޼ҵ� ȣ��
		
		if(animal instanceof Human) { 		// �ν��Ͻ� Ȯ��
			Human hum = (Human)animal;			// �ٿ� ĳ����
			hum.readBook();	
		}
		else if(animal instanceof Tiger) {
			Tiger tig = (Tiger)animal;
			tig.hunting();
		}
		else if(animal instanceof Eagle) {
			Eagle eag = (Eagle)animal;
			eag.flying();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
	}

}
