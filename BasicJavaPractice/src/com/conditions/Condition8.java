package com.conditions;

import java.util.Scanner;

public class Condition8 {
/////////////////////number is Positive or Negative or Zero//////////////////////
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Number is Positive");
		} else if (num < 0) {
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is Zero");
		}
	}
}
