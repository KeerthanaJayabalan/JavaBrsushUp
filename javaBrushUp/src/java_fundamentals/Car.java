package java_fundamentals;

public class Car extends Vehicle{
public void enginePower() {
	System.out.println("Power");
}
public static void main(String[] args) {
	Car car=new Car();
	car.enginePower();
}
}
