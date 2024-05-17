package java_interview_questions;


import java.util.HashMap;
import java.util.Map;


public class CountOccurrences {
public void countOccurrence(String[] s) {
	Map<String, Integer> map=new HashMap<String, Integer>();
	for (String string : s) {
		if(map.containsKey(string)) {
			map.put(string, map.get(string)+1);
		}else {
			map.put(string, 1);
		}
	}
	System.out.println(map);
}
public void countCharacters(String s) {
	char[] c=s.toCharArray();
	//System.out.println(c);
	Map<Character, Integer> map=new HashMap<Character, Integer>();
	for(char ch:c) {
		if(map.containsKey(ch)) {
			map.put(ch,map.get(ch)+1);
		}
		else {
			map.put(ch, 1);
		}
	}
	System.out.println(map);
}
	public static void main(String[] args) {
String[] strArray= {"India", "USA", "Italy", "India"};
CountOccurrences occurrences=new CountOccurrences();
occurrences.countOccurrence(strArray);
String s="The first and best victory is to conquer self";
occurrences.countOccurrence(s.split(" "));
String str1="Keerthana";
occurrences.countCharacters(str1);

	}

}
