package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("A");
		sList.add("C");
		sList.add("B");
		
		Stream<String> stream = sList.stream();	// stream 생성
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.println(s));	 // stream 소모

		
	}

}
