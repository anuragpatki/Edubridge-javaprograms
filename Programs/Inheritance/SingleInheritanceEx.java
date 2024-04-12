package com.inheritance;

class Parent{
	String surname="Menkar";
	String name="Ganesh";
	void displayp() {
		System.out.println("My Father Name Is : "+name);
	}
	void msg() {
		System.out.println("Parent Class");
	}
}

class Child extends Parent{
	String surname="Menkar19";
	String cname="Bhakti";
	void displayc() {
		System.out.println("My Surname: "+surname);
		System.out.println("My Parent Surname: "+super.surname);
		System.out.println("My Name Is : "+cname);
	}
	void msg() {
		super.msg();
		System.out.println("Child Class");
	}
	
}
public class SingleInheritanceEx {

	public static void main(String[] args) {
		Child c = new Child();
		c.displayc();
		c.displayp();
		c.msg();
	}

	

}