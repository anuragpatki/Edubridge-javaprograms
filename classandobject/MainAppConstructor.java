package com.classandobject;

public class MainAppConstructor {
	
	int i;
	 public MainAppConstructor(int i){
		  //calls the no arg const
		 this();
		  this.i=i;
		 
			System.out.println("Constructor is called "+i);
		}
	 public MainAppConstructor() {
		 System.out.println("Constructor no arg is called ");
	 }

	public static void main(String[] args) {
		//MainAppConstructor obj = new MainAppConstructor();
		MainAppConstructor obj1 = new MainAppConstructor(10);

	}

}