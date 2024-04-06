package com.abstractclasses.methods;

abstract class Shape{
	abstract void area();
	void display() {
		System.out.println("Display Method");
	}
}

//object creation for abstract class is not possible

class Rectangle extends Shape{
	void area() {
		int l=4;
		int b=5;
		int area=l*b;
		System.out.println("Area of Rectangle="+area);
	}
}

public class MainApp {

	public static void main(String[] args) {
		
		//Shape sob=new Shape(); //error , abstract class cannot be instantiated
		
		Rectangle rob = new Rectangle();
		rob.area();
        rob.display();
	}

}
