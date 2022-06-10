package innerclass;

class Outer {
	
	int outNum;
	static int sNum = 200;
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("runnable");
		}
	};
	
	
	public Runnable getRunnable() {
	
		int localNum = 100;
		return new Runnable() {

			@Override
			public void run() {
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
			
		};
	}	
}


public class LocalInnerClass {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable();
		runnable.run();
		
		outer.runnable.run();
	}

}
