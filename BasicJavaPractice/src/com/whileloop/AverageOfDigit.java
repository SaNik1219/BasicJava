package com.whileloop;

import java.util.Scanner;

public class AverageOfDigit {
//to find out the average of digit from the num.
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int count = 0;
		int rem;
		int sum = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			sum = sum + rem;
			count++;
		}
		int avg = sum / count;
		System.out.println(avg);
	  }
}


