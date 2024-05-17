package java_fundamentals;

class Student {
int tamil;
int eng;
final int math=85;
static String collName="NGP";
static String dept="CSE";
public static void m1(){
	System.out.println("static method");
}
public static void m1(int x){
	System.out.println("overloading method");
}
{
	int x=5;
	System.out.println(x);
	}
public void calculateAvg() {
	final int x=15;
	System.out.println(x);
	double avg=(tamil+eng+math)/3;
	System.out.println("Average: "+avg);
}
public static void main(int x) {
	System.out.println("Main method overloading");
}
public static void main(String[] args) {
Student keerthana=new Student();
keerthana.tamil=91;
keerthana.eng=92;
//keerthana.math=100;
keerthana.calculateAvg();

Student ram=new Student();
ram.tamil=80;
ram.eng=75;
//ram.math=70;
ram.calculateAvg();

Student Aruna=new Student();
System.out.println(Aruna.tamil);
m1();
main(0);
	}

}
