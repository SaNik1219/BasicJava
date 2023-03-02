package com.basic.java;

import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {

		int num, temp, sqr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num = sc.nextInt();

		int sum = 0, a = 0, b = 0, c = 1;
		sqr = num * num;
		temp = num;
		while (temp != 0) {
			c = c * 10;
			temp = temp / 10;
		}
		a = sqr % c;
		b = sqr / c;
		sum = a + b;
		if (sum == num) {
			System.out.println("Number is a Kaprekar Number");
		} else {
			System.out.println("Number is Not Kaprekar Number");
		}

	}

}
