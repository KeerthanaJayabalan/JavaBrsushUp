package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SplitList {

	public static void main(String[] args) {

		List<Integer> integers=new ArrayList<Integer>();
		integers.add(1);//0
		integers.add(5);//1
		integers.add(16);//2
		integers.add(47);//3
		integers.add(9);//4
		integers.add(14);//5
		System.out.println(integers);
		
		List<Integer> first=integers.subList(0, 2);
		System.out.println(first);
		List<Integer> last = integers.subList(2, 5);
		System.out.println(last);
		System.out.println("================");
		System.out.println("Using for loop: ");
		List<Integer> list1=new ArrayList<Integer>();
		for(int i=0; i<integers.size()/2; i++) {
			list1.add(integers.get(i));
		}
		System.out.println(list1);
		List<Integer> list2=new ArrayList<Integer>();
		for(int i=integers.size()/2; i<integers.size(); i++) {
			list2.add(integers.get(i));
		}
		System.out.println(list2);
	}

}
