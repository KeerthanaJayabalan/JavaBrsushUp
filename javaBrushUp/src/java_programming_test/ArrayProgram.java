package java_programming_test;


import java.util.Scanner;

public class ArrayProgram {

	public static void sortArray(int[] a) {
		int res = 0;
		for(int i=a.length-1; i>=0; i--) {
			for(int j=i-1; j>=0; j--) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;			
				}
			}
		}
		System.out.println("Sorted array");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=1; i<a.length; i++) {
			if(i%2==1) {
				res=res+a[i];
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner scanner=new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++) {
			array[i] = scanner.nextInt();	
		}
		scanner.close();
		System.out.println("Original array: ");
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		sortArray(array);
	}

}
