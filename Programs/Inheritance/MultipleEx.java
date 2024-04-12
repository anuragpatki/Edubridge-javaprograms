package com.inheritance;

interface A{
	void display();
	default void hello() {
		System.out.println("Hello default from interface A");
	}
	static void hello1() {
		System.out.println("Hello static from interface A");
	}
}

interface B{
	void msg();
}

class C implements A,B{

	@Override
	public void msg() {
		System.out.println("Interface B Methods");
		
	}

	@Override
	public void display() {
		System.out.println("Interface A Methods");		
	}
	
}
public class MultipleEx {

	public static void main(String[] args) {
		C c = new C();
		c.display();
		c.msg();
		c.hello();
		A.hello1();

	}

}