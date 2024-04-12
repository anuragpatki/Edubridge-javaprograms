package com.inheritance;

class Shape {
	// Common properties and methods for all shapes

	public void draw() {
		System.out.println("Drawing a shape");
	}
}

class Circle extends Shape {
	// Circle-specific properties and methods

	public void drawCircle() {
		System.out.println("Drawing a circle");
	}
}

class Cylinder extends Circle {
	// Cylinder-specific properties and methods

	public void drawCylinder() {
		System.out.println("Drawing a cylinder");
	}
}

class Square extends Shape {
	// Square-specific properties and methods

	public void drawSquare() {
		System.out.println("Drawing a square");
	}
}

class Cuboid extends Square {
	// Cuboid-specific properties and methods

	public void drawCuboid() {
		System.out.println("Drawing a cuboid");
	}
}

public class HybridInheritanceExample {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder();
		cylinder.draw(); // Output: Drawing a shape
		cylinder.drawCircle(); // Output: Drawing a circle
		cylinder.drawCylinder(); // Output: Drawing a cylinder
		
		System.out.println();
		
		Cuboid cuboid = new Cuboid();
		cuboid.draw(); // Output: Drawing a shape
		cuboid.drawSquare(); // Output: Drawing a square
		cuboid.drawCuboid(); // Output: Drawing a cuboid

	}

}