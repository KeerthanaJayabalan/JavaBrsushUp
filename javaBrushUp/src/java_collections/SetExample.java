package java_collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<String> set=new HashSet<String>();
		set.add("Venu");
		set.add("Keerthana");
		set.add("Bhargavi");
		set.add("Vamika");
		set.add("Nithruva");
		set.add("Latchumi");
		set.add("Tanu");
		//set.add(null);
		System.out.println(set);
		System.out.println(set.add("A"));
	}

}
