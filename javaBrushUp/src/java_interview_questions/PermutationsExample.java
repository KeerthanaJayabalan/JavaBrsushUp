package java_interview_questions;

public class PermutationsExample {
	public static void main(String[] args) {
        String number = "5609";
		/*
		 * System.out.println(number.toCharArray());
		 * System.out.println("*************");
		 */
        generatePermutations(number.toCharArray(), 0, number.length() - 1);
    }

    static void generatePermutations(char[] digits, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            // Print the current permutation
            System.out.println(String.valueOf(digits));
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                // Swap digits
                swap(digits, startIndex, i);

                // Recursively generate permutations for the remaining digits
                generatePermutations(digits, startIndex + 1, endIndex);

                // Undo the swap to backtrack
                swap(digits, startIndex, i);
            }
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
