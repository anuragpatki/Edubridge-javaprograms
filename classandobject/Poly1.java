package com.classandobject;

class Add{
	
	void add(int i, int j){   //ob.add(4,5);
        int s=i+j;
         System.out.println("the sum of 2 args="+s);
  }

  void add(int i, int j, int k){      //ob.add(4,3,2);
       int s=i+j+k;
               System.out.println("the sum of 3 args="+s);
 }

	
}

public class Poly1 {

	public static void main(String[] args) {
		
		Add a = new Add();
		a.add(4, 5);
		a.add(4, 3, 2);
		 
	}

}