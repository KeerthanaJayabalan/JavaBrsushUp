package java_fundamentals;

public class A {
	int x=10; //instance variable
	static int y=5; //static variable
	
	public void m1() {
int x=500; //local variable
		System.out.println("m1 method");
		System.out.println(x);
	}
	public void m2() {
		//int x=600;
		System.out.println(x);
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m2();
		
		
		
		/*
		 * A a2=new A(); a2.y=100; System.out.println(a2.x+" "+a2.y);
		 * System.out.println(y);
		 */
		
	}
}
