package com.arrays;

import java.util.Scanner;

public class SecLargeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,temp;
		
		System.out.print("Enter the size of array: ");
		n=sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the elements of the array: ");  
		
		for(int i=0; i<n; i++)  
		{  
		array[i]=sc.nextInt();  
		}   
		
		for(int i = 0; i<array.length; i++ ){
	         for(int j = i+1; j<array.length; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
		
		System.out.println("Second largest number is:: "+array[array.length-2]);

	}

}