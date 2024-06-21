package java_string;



public class StringMethods {
	public static void main(String[] args) {
		String s1="Time";
		System.out.println(s1.charAt(0)); //T, zero-based index
		
		s1=s1.concat(" is ");
		s1=s1+"precious";
		System.out.println(s1); //Time is precious

		String s2="Time is Precious";
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		
		System.out.println(s1.length()); //16
		
		System.out.println(s2.replace('P', 'p')); //Time is precious
		
		System.out.println(s1.substring(8)); //precious
		System.out.println(s1.substring(0, 5)); //Time 
		
		System.out.println(s2.toLowerCase()); //time is precious
		
		System.out.println(s2.toUpperCase()); //TIME IS PRECIOUS
		
		String s3=" Gold ";
		System.out.println(s3.trim()); //Gold
		
		String s4=new String("Keerthana");
		String s5="Keerthana";
		System.out.println(s4==s5); //false
		String s6=s4.intern();
		System.out.println(s5==s6); //true
		
		System.out.println(s4.indexOf('a')); //6
		
		System.out.println(s4.lastIndexOf('a')); //8
		
		








	}
}
