package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		
		TreeDPrinter<Powder> printer1 = new TreeDPrinter<Powder>();	// �����ڷ����� Power ���
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial();
		System.out.println(printer1);
	
		TreeDPrinter<Plastic> printer2 = new TreeDPrinter<Plastic>();	// �����ڷ����� Plastic ���
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		System.out.println(printer2);

		printer1.printing();
		printer2.printing();
		
	}

}
