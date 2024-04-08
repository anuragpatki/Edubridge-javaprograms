package com.classandobject;

class OverloadDataTypes{
	 void display(int i, int j){
	        System.out.println("2 int values");
	  }
	   
	void display(byte i, byte j){
	     System.out.println("2 byte values");
	}

	void display(short  i, short j){
	       System.out.println("2 short values");
	}
	void display(long i, long j){
	     System.out.println("2 long values");
	}
	void display(float  i, float j){
	       System.out.println("2 float values");
	}
	void display(double  i, double j){
	        System.out.println("2 double values");
	}
}

public class MainAppFunctionOverload {

	public static void main(String[] args) {

		OverloadDataTypes ob = new OverloadDataTypes();
		ob.display((byte) 2, (byte) 4); // byte
		ob.display((short) 67, (short) 34);// short
		ob.display(167, 134); // int
		ob.display((long) 6734, (long) 3412l); // long ob.display(6734l, 3412l);
		ob.display(45.3f, 78.2f); // float //or ob.display((float)45.3, (float)78.2);
		ob.display(67432.8, 3421.89); // double
		
	}

}