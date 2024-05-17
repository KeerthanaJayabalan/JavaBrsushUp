package java_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ListIteratorDemo {
	
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("A");
	list.add("B");
	list.add(null);
	list.listIterator();


}
}
