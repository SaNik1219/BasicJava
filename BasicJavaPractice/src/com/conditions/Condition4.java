package com.conditions;

import java.util.Scanner;

public class Condition4 {

	public static void main(String[] args) {
//////////////////Number Printing/////////////////
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Between 1 to 5");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("One");
		} else if (num == 2) {
			System.out.println("Two");
		} else if (num == 3) {
			System.out.println("Three");
		} else if (num == 4) {
			System.out.println("Four");
		} else if (num == 5) {
			System.out.println("Five");
		} else {
			System.out.println("Invalid Number");
		}

	}
}
