package com.basic.java;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number : ");
		int num = sc.nextInt();
		int n = num;
		int d = 0, sum = 0;
		String s = Integer.toString(num);
		int len = s.length();

		while (n > 0) {
			d = n % 10;
			sum = sum + (int) Math.pow(d, len);
			len--;
			n = n / 10;
		}

		if (sum == num)
			System.out.println("Disarium Number.");
		else
			System.out.println("Not a Disarium Number.");
	}

}
