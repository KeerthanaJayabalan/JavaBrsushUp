package java_string;

public class StringDemo1 {
	public static void main(String[] args) {
		String s1=new String("Keerthana");
		String s2=new String("Keerthana");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("---------------------");
		StringBuffer sb1=new StringBuffer("Venu");
		StringBuffer sb2=new StringBuffer("Venu");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}
}
