package java_collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> integers=new ArrayList<Integer>();
		integers.add(5);
		integers.add(50);
		integers.add(21);
		integers.add(26);
		integers.add(64);	
		integers.add(72);
		integers.add(57);
		integers.add(49);
		integers.add(33);
		//Comparator<Integer> comparator=Comparator.reverseOrder();
		System.out.println(integers);

	}

}
