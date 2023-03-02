package com.conditions;

import java.util.Scanner;

public class Condition5 {
////////////////////////Blood Donation Eligibility Test////////////////////////

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age = sc.nextInt();

		System.out.println("Enter the Weight:");
		int wt = sc.nextInt();

		if (age > 18) {
			if (wt > 50) {
				System.out.println("Eligible for Blood Donation");
			} else {
				System.out.println("Weight is less try next time..:-)");
			}
		} else {
			System.out.println("Not Eligible");
		}
	}

}
