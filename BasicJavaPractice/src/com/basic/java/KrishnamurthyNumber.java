package com.basic.java;

import java.util.Scanner;

public class KrishnamurthyNumber {
//WAP to check no is Krishnamurthy or not (Using while loop)
//	i.e. 153 = 1! + 5! + 3! = 153
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();

		int temp = num;
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
			}
			System.out.println("dispaly the num:" +fact);
			sum = sum + fact;
			num = num / 10;
		}
		num = temp;
		if (sum == temp) {
			System.out.println("Number Is Krishnamurthy");
		} else {
			System.out.println("Number Is Not Krishnamurthy");
		}
	}

}
