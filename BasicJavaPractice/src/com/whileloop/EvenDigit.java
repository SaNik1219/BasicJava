package com.whileloop;

import java.util.Scanner;

public class EvenDigit {
//find out even digit from the number.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int even_count = 0;

		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				even_count++;
				System.out.println(even_count);
			}
			num = num / 10;
		}
		System.out.println("Number of Even numbers: " + even_count);

	}

}
