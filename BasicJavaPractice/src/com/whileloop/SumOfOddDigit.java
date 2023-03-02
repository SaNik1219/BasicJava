package com.whileloop;

import java.util.Scanner;

public class SumOfOddDigit {
//sum of add digit from the given number.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int odd_count = 0;

		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				odd_count++;
				sum=sum+rem;	
			} 
			num=num/10;
			}
		System.out.println(sum);
		}
	}


