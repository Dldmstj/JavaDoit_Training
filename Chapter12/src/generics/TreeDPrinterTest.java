package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		
		TreeDPrinter<Powder> printer1 = new TreeDPrinter<Powder>();	// 참조자료형을 Power 사용
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial();
		System.out.println(printer1);
	
		TreeDPrinter<Plastic> printer2 = new TreeDPrinter<Plastic>();	// 참조자료형을 Plastic 사용
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		System.out.println(printer2);

		printer1.printing();
		printer2.printing();
		
	}

}
