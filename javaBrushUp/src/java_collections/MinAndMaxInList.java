package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAndMaxInList {
public static void main(String[] args) {
	List<Integer> integers=new ArrayList<Integer>();
	integers.add(1);
	integers.add(5);
	integers.add(16);
	integers.add(47);
	integers.add(9);
	integers.add(14);
	System.out.println(integers);
	System.out.println("Min: "+Collections.min(integers));
	System.out.println("Max: "+Collections.max(integers));
}
}
