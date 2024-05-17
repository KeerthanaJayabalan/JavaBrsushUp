package java_collections;


import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethods {

	public static void main(String[] args) {
			SortedSet<Integer> integers=new TreeSet<Integer>();
			integers.add(5);
			integers.add(50);
			integers.add(21);
			integers.add(26);
			integers.add(64);
			integers.add(72);
			integers.add(57);
			integers.add(49);
			integers.add(33);
			System.out.println(integers); //[5,21,26,33,49,50,57,64,72]
			System.out.println(integers.first());//5
			System.out.println(integers.last());//72
			System.out.println(integers.headSet(21));//5
			System.out.println(integers.tailSet(21));//21/26,33,49,50,57,64,72
			System.out.println(integers.subSet(21, 64));//21,26,33,49,50,57
			System.out.println(integers.comparator());
	}

}
