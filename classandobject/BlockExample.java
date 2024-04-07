package com.classandobject;

public class BlockExample {
	static {
		int a=10;
		System.out.println(a);
	}
	
	public static void show(int p) {
		System.out.println(p*p*p);
	}
	
	{
		System.out.println("Instance Block");
	}
	
	public BlockExample() {
		System.out.println("In a Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(10);
		BlockExample obj = new BlockExample();

	}

}