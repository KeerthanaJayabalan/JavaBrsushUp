package java_fundamentals;

import java.util.Arrays;

public class MergeSortedArrays {
	static int arr1[] = new int[] { 1, 5, 9, 10, 15, 20 };
    static int arr2[] = new int[] { 2, 3, 8, 13 };
 
       public static void merge(int m, int n)
    {
        int i = 0, j = 0, k = m - 1;
        while (i <= k && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
      
    public static void main(String[] args)
    {
        merge(arr1.length, arr2.length);
        System.out.println("After Merging:");
        System.out.print("First Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(arr2));
    }
}
