package com.arrays;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n,sum=0;
		
		System.out.print("Enter the size of array: ");
		n=sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the elements of the array: ");  
		
		for(int i=0; i<n; i++)  
		{  
		array[i]=sc.nextInt();  
		}  

		for (int i=0; i<n; i++)   
		{  
			sum += array[i];  
		}  
		
		float avg=sum/n;
		System.out.println("Average of all the elements of an array: " + avg);

	}

}