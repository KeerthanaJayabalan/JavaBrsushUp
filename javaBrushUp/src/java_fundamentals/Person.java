package java_fundamentals;

public class Person {
private String name;
private int age;
private int salary=50000;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
/*
 * public void setSalary(int salary) { this.salary = salary; }
 */

public static void main(String[] args) {
	Person teacher=new Person();
	teacher.setName("Aruna");
	teacher.setAge(28);
	//teacher.setSalary(75000);
	System.out.println(teacher.getName());
	System.out.println(teacher.getAge());
	System.out.println(teacher.getSalary());
}
}
