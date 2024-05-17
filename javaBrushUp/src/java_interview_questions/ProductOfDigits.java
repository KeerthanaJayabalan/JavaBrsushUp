package java_interview_questions;

import java.util.HashSet;
import java.util.Set;

public class ProductOfDigits {

	public static void main(String[] args) {
		
		String s="abccdseffff";
		Set<Character> set=new HashSet<Character>();
		char[] ch = s.toCharArray();
		System.out.println(ch);
		for (char c : ch) {
			set.add(c);
		}
		System.out.println(set);
	}
	
}
