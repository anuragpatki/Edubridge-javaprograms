package com.classandobject;

public class MainAppConstructor1 {
	
	int i;
	 public MainAppConstructor1(int i){
		  //calls the no arg const
		// this();
		  this.i=i;
		 
			System.out.println("Constructor is called "+i);
		}
	 public MainAppConstructor1() {
		 this(9);
		 System.out.println("Constructor no arg is called ");
	 }

	public static void main(String[] args) {
		MainAppConstructor1 obj = new MainAppConstructor1();
		//MainAppConstructor obj1 = new MainAppConstructor(10);

	}

}