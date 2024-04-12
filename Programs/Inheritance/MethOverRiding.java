package com.inheritance;

class MyBaseClass {
	//Method overriding--->method name are same,Parameter 
	//are also same but apply in super and sub class
	public void disp() {
		System.out.println("Parent class method");
	}
}

class MyChildClass extends MyBaseClass {
	// protected void disp(){
	public void disp() {
		super.disp();
		System.out.println("Child class method");
	}
}
	

public class MethOverRiding {

	public static void main(String[] args) {
		MyChildClass obj = new MyChildClass();
		obj.disp();

	}

}