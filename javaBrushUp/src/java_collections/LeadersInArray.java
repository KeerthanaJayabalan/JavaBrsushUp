package java_collections;

import java.util.Scanner;

public class LeadersInArray {

	public static void findLeaders(int[] a){
		System.out.println("Approach 1");
		for(int i=0; i<a.length;i++) {
			int j;
			for(j=i+1; j<a.length; j++) {
				if(a[i]<=a[j]) {
					break;
				}
			}
			if(j==a.length) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}
	public static void printLeaders(int[] a, int size) {
		System.out.println("Approach 2");
		//int size=a.length;
		int leader=a[size-1];
		//rightmost element is always a leader
		System.out.print(leader+" ");
		for(int i=size-2; i>=0; i--) {
			if(leader<a[i]) {
				leader=a[i];
			}
			System.out.print(leader+" ");
		}

	}
	public static void main(String[] args) {

		int[] arr = {16, 17, 4, 3, 5, 2};
		findLeaders(arr);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=scanner.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++) {
			array[i]=scanner.nextInt();
		}
		printLeaders(array, n);
		scanner.close();
	}

}
