package java_collections;

import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {

		LinkedList<String> list=new LinkedList<String>();
		list.add("Durga");
		list.add("Keerthana");
		list.add(null);
		list.set(1, "Software");
		list.removeLast();
		list.addFirst("CCC");
		System.out.println(list);
	}

}
