package com.conditions;

import java.util.Scanner;

public class Condition13 {
/////////num is odd or even using ternary operator/////////////////////
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		String evenOdd = (num % 2 == 0) ? "even" : "odd";
		System.out.println(num + " is " + evenOdd);
	}

}
