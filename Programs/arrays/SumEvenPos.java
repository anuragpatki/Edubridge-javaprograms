package com.arrays;

import java.util.Scanner;

public class SumEvenPos {

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
				if (i%2==0) {// position 0 2 4 6 etc.
					sum += array[i];		
				}  
			}  
			
			System.out.println("Sum of all the even position elements of an array: " + sum);
			sc.close();
	}
	
}