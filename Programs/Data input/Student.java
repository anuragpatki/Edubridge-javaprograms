package com.input;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int id;
		String name;
		float fees;
		char gender;
				/*
				id = 100;
				name = "Manoj";
				fees = 65243.3f;
				gender = 'M';
				*/
				
				//for input data need to create object of Scanner
				
		Scanner scanner = new Scanner(System.in);
			   
		System.out.print("Enter your name = ");
			 //  name = scanner.next(); //Trupti single word
		name = scanner.nextLine(); //Trupti Rasker multiple word
			   	   
		System.out.print("Enter Id = ");
		id = scanner.nextInt(); //read integer
				   
		System.out.print("Enter fees = ");
  	    fees = scanner.nextFloat();  //double nextDouble(), byte nextByte()
				   
  	    System.out.print("Enter Gender = ");
  	    gender = scanner.next().charAt(0);
		//Display Student details
						
		System.out.println("id="+id);
		System.out.println("Name="+name);
        System.out.println("fees="+fees);
        System.out.println("Gender="+gender);
        scanner.close();
		}
	
	}