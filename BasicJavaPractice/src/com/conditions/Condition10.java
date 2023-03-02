package com.conditions;

import java.util.Scanner;

public class Condition10 {
/////////////////Number is divisible by 3 & 9/////////////////////
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num:");
		int num = sc.nextInt();

		if (num % 3 == 0) {
			System.out.println("Number is Divisible by 3");
		} else if (num % 9 == 0) {
			System.out.println("Number is Divisible by 9");
		} else {
			System.out.println("Number is not divisible by 3 & 9");
		}
	}

}
