package com.defaultmethods;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Basic Salary of the employee = ");
		double bs = sc.nextDouble();
		if(bs >= 0 && bs <= 10000) {
			double hra = (bs*20)/100;
			double da = (bs*80)/100;
			System.out.println("The Gross Salary of the Employee = "+(bs+hra+da));
		}
		else if(bs > 10000 && bs <= 20000) {
			double hra = (bs*25)/100;
			double da = (bs*90)/100;
			System.out.println("The Gross Salary of the Employee = "+(bs+hra+da));
		}
		else {
			double hra = (bs*30)/100;
			double da = (bs*95)/100;
			System.out.println("The Gross Salary of the Employee = "+(bs+hra+da));
		}

		sc.close();
	}

}