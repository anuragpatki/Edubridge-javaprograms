package com.classandobject;

class Add2{
	void Addition(int A, int B) {
		int c=A+B;
		System.out.println(c);
	}
}

public class Function2 {

	public static void main(String[] args) {
		Add2 a = new Add2();
		int e= 20;
		int f= 20;
		a.Addition(e, f);

	}

}