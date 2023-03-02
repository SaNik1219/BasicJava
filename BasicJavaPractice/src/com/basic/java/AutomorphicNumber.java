package com.basic.java;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int copy = num;
		int count = 0;

		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count + " " + num);
		num = copy;
		int sq = num * num;
		int power = 1;
		for (int i = 1; i <= count; i++) {
			power = power * 10;
		}
		System.out.println(power);
		int end = sq % power;
		System.out.println(num + " " + end);

		if (num == end) {
			System.out.println("Automorphic Number");
		} else {
			System.out.println("Not Automorphic Number");
		}
	}

}
