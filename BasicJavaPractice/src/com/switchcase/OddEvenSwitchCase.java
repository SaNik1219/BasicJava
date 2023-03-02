package com.switchcase;

import java.util.Scanner;
//num is odd or even using switch case.
public class OddEvenSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println("Number is Even");
			break;

		case 1:
			System.out.println("Number Is Odd");
			break;

		}
	}

}
