package com.arrays;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Enter the number of elements you want to store: ");
		n=sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the elements of the array: ");  
		
		for(int i=0; i<n; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		
		System.out.println("Array elements are: ");  

		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]);  
		}  
		

	}

}