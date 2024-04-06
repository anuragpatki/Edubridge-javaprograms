package com.arrays;

import java.util.Scanner;

public class RightToLeftDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Create a 3x3 matrix
		int[][] matrix = new int[3][3];

		// Get the matrix elements from the user
		System.out.println("Enter the matrix elements:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Enter element [" + i + "][" + j + "]: ");
				matrix[i][j] = sc.nextInt();
			}
		}

		// Display the right-to-left diagonal elements
		System.out.println("Right-to-left diagonal elements:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i+j == 3-1)
					System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}