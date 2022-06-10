package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueque(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueque() {
		
		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("Queue Underflow");
			return null;
		}
		
		String data = arrayQueue.remove(0);
		return data;
	}
}

public class QueueTest {

	
	public static void main(String[] args) {

		MyQueue myQueue = new MyQueue();
		
		myQueue.enQueque("A");
		myQueue.enQueque("B");
		myQueue.enQueque("C");
		
		System.out.println(myQueue.deQueque());
		System.out.println(myQueue.deQueque());
		System.out.println(myQueue.deQueque());
		System.out.println(myQueue.deQueque());
		
	}

}
