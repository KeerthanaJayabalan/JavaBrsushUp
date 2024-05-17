package java_fundamentals;

public class ArrayRotation {
	public static void rotateLeft(int[] arr, int n) {
		int[] temp=new int[n];
		int length=arr.length;
		//copy the positions to temp
		for(int i=0; i<n; i++) {
			temp[i]=arr[i];
		}
		//shift the remaining elements to left
		for(int i=n; i<length; i++){
			arr[i-n]=arr[i];
		}

		// Copy the elements from the temporary array to the end of the original array
		for(int i=0; i<n; i++) {
			arr[length - n + i]=temp[i];
		}
	}

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		int positionsToRotate=2;
		System.out.println("Original array:");
		for (int i : arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
		rotateLeft(arr, positionsToRotate);
		System.out.println("Array after rotation: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
