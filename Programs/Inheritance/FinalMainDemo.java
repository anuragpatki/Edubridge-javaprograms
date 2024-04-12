package com.inheritance;

//final class MyClass{ //if the class is final, no more child
class MyClass{
	final int i=45; //like const in C programing
	public MyClass() {
	    	
	}
	void modifyData() {
		//i=i+4; //final values cannot be change
		
	}
	// final void display() {
	void display() {
		System.out.println("Parent class MyClass display method");
	}
	void display(int i) {
		System.out.println("Parent class MyClass display method");
	}
	
}
//class MyChildClass extends MyClass{ //because final keyword, no child class
//	
//}

class MyChildClass1 extends MyClass{
	 void display() { //final methods cannot be overridden
		 
		System.out.println("MyChildClass  display method");
		super.display();
	}
}


public class FinalMainDemo {

	public static void main(String[] args) {
		MyChildClass1 obj = new MyChildClass1();
		obj.display();

	}

}