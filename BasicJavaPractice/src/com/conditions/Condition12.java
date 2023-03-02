package com.conditions;

import java.util.Scanner;
/////////////eligibility for Driving License//////////////////////
public class Condition12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Age: ");
		int age = sc.nextInt();

		System.out.println("Enetr the PANCARD details: ");
		int pan = sc.nextInt();

		System.out.println("Enter the SSC Marks: ");
		int mark = sc.nextInt();

		if (age >= 18) {
			if (mark >= 40) {
				if (pan == 1) {
					System.out.println("Eligilble for Driving License");
				} else {
					System.out.println("Not eligilble for Driving License");
				}
			} else {
				System.out.println("Not eligilble for Driving License");
			}
		} else {
			System.out.println("Not eligilble for Driving License");
		}

	}
}
