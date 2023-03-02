package com.whileloop;

import java.util.Scanner;

public class CountNumberOfDigit {
//count the num of digit from given number.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}

}
