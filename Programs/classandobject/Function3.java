package com.classandobject;

class Add3{
	int Addition() {
		int A= 10;
		int B= 20;
		int C=A+B;
		return C;
	}
}

public class Function3 {

	public static void main(String[] args) {
		Add3 a = new Add3();
		System.out.println(a.Addition());

	}

}