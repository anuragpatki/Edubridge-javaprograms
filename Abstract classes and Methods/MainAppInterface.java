package com.abstractclasses.methods;

interface MyInterface{
	int k=10; //public static final int k=10
	void meth1(); //public abstract void meth1
	void meth2();
}

class MyClass implements MyInterface{
	
	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1"+k);
		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2"+k);
		
	}
	
}

public class MainAppInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		obj.meth1();
		obj.meth2();
	}

}