package com.arrays;

import java.util.Scanner;

public class DelElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();

		int[] array = new int[n];

		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Original array elements are: ");

		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Enter an element you want to delete :");
		int ele = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == ele) // If element found
			{
				// shifting elements
				for (int j = i; j < array.length - 1; j++) {
					array[j] = array[j + 1];
				}
				break;
			}
		}

		System.out.println("Array after deleting element: ");

		for (int i = 0; i < n-1; i++) {
			System.out.print(array[i] + " ");
		}

	}

}