package com.inheritance;

class Vehical1{
	String vehical="Four Wheeler";
	void displayV() {
		System.out.println("Category: "+vehical);
	}
}

class Car1 extends Vehical1{
	String car = "BMW";
	void displayC() {
		System.out.println("Car: "+car);
	}
}

class Bmw extends Car1{
	String model = "XM Model";
	void displayM() {
		System.out.println("Model: "+model);
	}
}

public class MultilevelEx {

	public static void main(String[] args) {
		Bmw b = new Bmw();
		b.displayV();
		b.displayC();
		b.displayM();
	}

}