package com.classandobject;

class Disp {
	void display(int i, float j) { // ob.display(4,5.3f);
		System.out.println("two arg int and float");
	}

	void display(float j, int i) { // ob.display(7.9f, 7);
		System.out.println("two arg float and int");
	}
}

public class Poly3 {

	public static void main(String[] args) {
		Disp dp = new Disp();
		dp.display(3.14f, 5);
		dp.display(5, 3.14f);

	}

}