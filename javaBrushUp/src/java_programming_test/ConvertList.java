package java_programming_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ConvertList {
	public static List<Integer> convertToLinkedList(List<Integer> list) {
		if(list.size()==0) {
			return null;
		}
		List<Integer> linkedList=new LinkedList<Integer>();
		linkedList.addAll(list);
		return linkedList;
	}
	public static void main(String[] args) {
		System.out.println("Enter the size of the list");
		Scanner scanner=new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Enter the elements");
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0; i<size; i++) {
			int element = scanner.nextInt();
			list.add(element);
		}
		scanner.close();
		System.out.println("Array list: "+list);
		List<Integer> linkedList = convertToLinkedList(list);
		System.out.println("Linked list: "+linkedList);
	}

}
