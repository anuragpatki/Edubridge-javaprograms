package com.classandobject;

class Display{
	
		void display(float r){ 
		    System.out.println("Displaying float value :"+r);
		}
		void display(int s){ 
		    System.out.println("Displaying int value :"+s);
		}
}

public class Poly2 {

	public static void main(String[] args) {
		Display d = new Display();
		d.display(3.14f);
		d.display(5);
		
	}

}