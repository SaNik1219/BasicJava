package com.conditions;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
////////////Largest Number Between Two Number//////////////
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("num1 is greater" + num1);
		} else {
			System.out.println("num2 is greater" + num2);
		}
	}

}
