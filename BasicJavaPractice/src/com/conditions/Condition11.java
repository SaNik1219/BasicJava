package com.conditions;

import java.util.Scanner;

public class Condition11 {
////////////////////////Given Char Is Alphabet Or Digit///////////////////////
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any character or number : ");
		char ch = sc.next().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

			System.out.println(ch + " is a Alphabet");

		} else if (ch >= '0' && ch <= '9') {

			System.out.println(ch + " is a Digit");

		} else {

			System.out.println(ch + " is a Special Character");
		}

	}

}
