package com.classandobject;

class Add1{
	int Addition(int A, int B) {
		int c=A+B;
		return c;
	}
}
public class Function1 {

	public static void main(String[] args) {
		Add1 a = new Add1();
		int e= 10;
		int f= 20;
		System.out.println(a.Addition(e, f));

	}

}