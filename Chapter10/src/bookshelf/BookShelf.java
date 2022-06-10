package bookshelf;

import java.util.ArrayList;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);		// �� �������� remove
	}

	@Override
	public int getSize() {
		return getCount();
	}
	

}
