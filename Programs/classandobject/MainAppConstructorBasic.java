package com.classandobject;

public class MainAppConstructorBasic {
	
	int i;
	 public MainAppConstructorBasic(int i){
		  this.i=i;
			System.out.println("Constructor is called "+i);
		}
	 public MainAppConstructorBasic() {
		 System.out.println("Constructor no arg is called ");
	 }

	public static void main(String[] args) {
		MainAppConstructor obj = new MainAppConstructor();
		MainAppConstructor obj1 = new MainAppConstructor(10);

	}

}