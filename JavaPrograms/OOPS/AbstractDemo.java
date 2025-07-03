package OOPS;

abstract class Vehicle {
	abstract void drive();

	void applyBreak() {
		System.out.println("Applying Break");
	}
}

class car extends Vehicle {
	void drive() {
		System.out.println("Driving a Car");
	}
	
	void changeGear()
	{
		System.out.println("Changing the Car Gear");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Vehicle v = new car();
		v.drive();
		v.applyBreak();
		car c = new car();
		c.changeGear();

	}

}
