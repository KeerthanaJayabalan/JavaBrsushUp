package java_interview_questions;



public class ArrayPrograms {
	public static void sortedArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
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
	}
public static void findMaxAndMinValue(int[] a) {
	int max=a[0];
	int min=a[0];
	for(int i=1; i<a.length; i++) {
		if(a[i]>max) {
			max=a[i];
		}
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("Max value: "+max);
	System.out.println("Min value: "+min);
}

public static void reversedArray(int[] a) {
	for(int i=a.length-1; i>=0; i--) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		int[] a= {15,1,5,2,65,89};
		sortedArray(a);
		findMaxAndMinValue(a);
		reversedArray(a);
	}
}
