package com.classandobject;

public class Employee {

		int id;
		String name;
		static String company="Edubridge";
		
		public Employee(int id, String name) {
			this.id=id;
			this.name=name;
		}
		
		public void display() {
			System.out.println("ID: "+id+"\nName: "+name+"\nCompany Name: "+company);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee Emp1 = new Employee(101,"Anuj");
			Employee Emp2 = new Employee(102,"Bhanu");
			Emp1.display();
			Emp2.display();

	}

}