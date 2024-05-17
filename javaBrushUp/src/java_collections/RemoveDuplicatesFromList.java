package java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromList {

	public static void removeDuplicates(List<Integer> list) {
	
		List<Integer> newList=new ArrayList<Integer>();
		for (Integer integer : list) {
			if(!newList.contains(integer)) {
				newList.add(integer);
			}	
		}
		System.out.println(newList);
	}	
	public static void main(String[] args) {
List<Integer> integers=new ArrayList<Integer>(Arrays.asList(1,2,5,6,2,1,8));
removeDuplicates(integers);
		
	}

}
