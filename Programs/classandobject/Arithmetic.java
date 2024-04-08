package com.classandobject;

import java.util.Scanner;

public class Arithmetic {
	
	int a,b;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
	}

	public void add() {
		System.out.println("Add: "+(a+b));
	}
	
	public int sub() {//default method with return
		int c= a-b;
		return c;
	}
	
	public void mul(float a, float b) {//Parameterized without return
		System.out.println("Mul: "+(a*b));
	}
	
	public float div(float p, float q) {
		return p/q;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic ar = new Arithmetic();
		ar.accept();
		ar.add();
		int r=ar.sub();
		System.out.println("Sub: "+r);
		ar.mul(2.3f, 5.9f);
		float i= ar.div(30.5f, 5.0f);
		System.out.println("Div: "+i);
	}

}