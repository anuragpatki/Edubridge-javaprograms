package com.abstractclasses.methods;

abstract class ShapeFig{
	private int k;
	
	ShapeFig(int k){
		this.k = k;
	}
	abstract void area();
	final void display() {
		System.out.println("display method "+k);
	}
}

class Reactangle extends ShapeFig{

	public Reactangle(int i) {
		super(i);
		System.out.println("Child class constructor");
		
	}
	

	@Override
	void area() {
		int l=4;
		int b=6;
		int area = l*b;
		System.out.println("area of reactangle="+area);
		
	}
	
}

public class MainAppAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape sob = new Shape(); error object creation is not possible
		
				Reactangle rob = new Reactangle(20);
				rob.area();
				rob.display();

	}

}
