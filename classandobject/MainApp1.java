package com.classandobject;

public class MainApp1 {
	
	 static int i;
	 int k;  //0
	 float f; //0.0
	 String s; //null

	 MainApp1(){
		 
	 }
	 MainApp1(int k, float f, String s){
		 this.k=k;
		 this.f=f;
		 this.s=s;
	 }

		@Override
		public String toString() {
			return "MainApp1 [k=" + k + ", f=" + f + ", s=" + s + "]";
		}

	public static void main(String[] args) {
		int p;
		System.out.println(i); //default value 0
		
		MainApp1 ob = new MainApp1();
		System.out.println(ob.k);
		System.out.println(ob.f);
		System.out.println(ob.s);
		
		System.out.println(ob);
		MainApp1 ob1 = new MainApp1(3,98.4f,"Pratiksha");
		System.out.println(ob1);

	}

}