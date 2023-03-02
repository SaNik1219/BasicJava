package com.conditions;

import java.util.Scanner;

public class Condition15 {
//////////////////////greatest in between 3 num using ternary////////////////////
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter the num2:");
		int num2 = sc.nextInt();

		System.out.println("Enter the num3:");
		int num3 = sc.nextInt();

		int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

		System.out.println("Largest number among " + num1 + ", " + num2 + " and " + num3 + " is " + max);

	}

}
