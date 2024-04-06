package com.arrays;

import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Enter the number of elements you want to store: ");
		n=sc.nextInt();
		
		int[] array = new int[n+1];
		
		System.out.println("Enter the elements of the array: ");  
		
		for(int i=0; i<n; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		System.out.println("Original array elements are: ");  

		for (int i=0; i<n; i++)   
		{  
		System.out.print(array[i]+" ");  
		}  
		System.out.println();
		System.out.println("Enter an element you want to insert :");
		int ele = sc.nextInt();
		
		System.out.println("Enter the position to insert the array element at: ");
		int index = sc.nextInt();
		
		 for(int i = (n-1); i >= (index-1); i--)
	        {
	            array[i+1] = array[i];
	        }
	     array[index-1] = ele;
		 		
		System.out.println("Array after adding element: ");
		
		for (int i=0; i<n; i++)   
		{  
		System.out.print(array[i]+" ");  
		}  
		System.out.println(array[n]);
	}

}