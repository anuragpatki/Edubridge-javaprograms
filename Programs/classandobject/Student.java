package com.classandobject;

public class Student {
	
	int id;
	String name;
	static String clg="KBP";
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public void display() {
		System.out.println("ID: "+id+"\nName: "+name+"\nCollege Name: "+clg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student(101,"Anuj");
		Student stu2 = new Student(102,"Bhanu");
		stu1.display();
		stu2.display();

	}

}