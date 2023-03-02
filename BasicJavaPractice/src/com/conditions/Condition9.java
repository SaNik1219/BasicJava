package com.conditions;

import java.util.Scanner;

public class Condition9 {
///////////////number is positive,Negative or Zero by using Ternary////////
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1:");
		int num1 = sc.nextInt();
		String ans = (num1 > 0) ? "Positive" : (num1 < 0) ? "Negative " : "Zero";
		System.out.println(ans);
	}

}
