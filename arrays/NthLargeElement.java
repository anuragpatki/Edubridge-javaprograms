package com.arrays;

import java.util.Scanner;

public class NthLargeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,temp,k;
		
		System.out.print("Enter the size of array: ");
		n=sc.nextInt();
		
		System.out.print("Enter the number of largest element you want to find: ");
		k=sc.nextInt();
		
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
		
		System.out.println(k+" th largest number is:: "+array[array.length-k]);

	}

}