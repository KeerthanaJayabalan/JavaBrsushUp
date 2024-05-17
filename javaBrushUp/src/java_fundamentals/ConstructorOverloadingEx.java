package java_fundamentals;

public class ConstructorOverloadingEx {
	ConstructorOverloadingEx() {
		this(10);
		System.out.println("No args constructor");
	}
	ConstructorOverloadingEx(int i) {
		this(10.5);
		System.out.println("int-args constructor");
	}
	ConstructorOverloadingEx(double d) {
		System.out.println("double-args constructor");
	}
	public static void main(String[] args) {
		ConstructorOverloadingEx ex=new ConstructorOverloadingEx();
		System.out.println("*********");
		ConstructorOverloadingEx ex2=new ConstructorOverloadingEx(5);
		System.out.println("*********");
		ConstructorOverloadingEx ex3=new ConstructorOverloadingEx(5.5);
		System.out.println("*********");
		ConstructorOverloadingEx ex4=new ConstructorOverloadingEx(1648l);

	}
}
