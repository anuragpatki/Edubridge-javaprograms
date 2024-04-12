package com.inheritance;

class Vehical{
	String vehical="Transports";
	void displayV() {
		System.out.println("Category: "+vehical);
	}
}

class Car extends Vehical{
	String car = "BMW";
	void displayC() {
		System.out.println("Car: "+car);
	}
}

class Bike extends Vehical {
	String bike = "Splendor";
	void displayB() {
		System.out.println("Bike: "+bike);
	}
}

class Bicycle extends Vehical{
	String cycle = "Hero";
	void displayBy() {
		System.out.println("Bicycle: "+cycle);
	}
}

public class HierarchicalEx {

	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		Bicycle by = new Bicycle();
		c.displayV();
		c.displayC();
		b.displayB();
		by.displayBy();

	}

}