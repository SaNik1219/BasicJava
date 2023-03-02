package com.whileloop;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {

		int sum = 0;
		for (int num = 0; num <= 20; num++) {
			boolean isprime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				sum = sum + num;
			}
		}
		System.out.println("total addition of:" + sum);
	}
}
