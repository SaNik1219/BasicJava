package com.whileloop;

import java.util.Scanner;

public class PalindromeNumber {
//////////palindrome number///
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num:");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0, rem;
		while (temp != 0) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (num == rev) {
			System.out.println(num + " is palindrome number");
		} else {
			System.out.println(num + " is not a palindrome number");
		}
	}

}
