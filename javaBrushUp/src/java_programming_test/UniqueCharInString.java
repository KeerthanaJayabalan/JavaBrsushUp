package java_programming_test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharInString {
	public static Set<Character> findUniquwCharacters(String s) {
			
		char[] chArray = s.toCharArray();
		Set<Character>  set=new HashSet<Character>();
		for (char c : chArray) {
			set.add(c);
		}
		
		return set;
	}
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scanner=new Scanner(System.in);
		String givenStr = scanner.nextLine();
		scanner.close();
		Set<Character> uniqueSet = findUniquwCharacters(givenStr);
		System.out.println(uniqueSet);
	}
}
