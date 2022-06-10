package generics;

public class TreeDPrinter<T extends Material> {		
	// TreeDPrinter를 제네릭 클래스로 사용, Material 클래스를 상속받은 클래스만 참조 자료형으로 사용 가능
	
	private T material;	

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
		
	}

	@Override
	public String toString() {
		return material.toString();
	}

	public void printing() {
		material.doPrinting();
	}
	
}
