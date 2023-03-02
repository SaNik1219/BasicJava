package com.conditions;

import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {
////////////////Number is divisible By 5 Or Not///////////////
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();

		if (num % 5 == 0) {
			System.out.println("Number is Divisible by 5");
		} else {
			System.out.println("Number is Not Divisible by 5");
		}

	}

}
