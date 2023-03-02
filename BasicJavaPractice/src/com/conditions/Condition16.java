package com.conditions;

import java.util.Scanner;

public class Condition16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char:");
		char ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Its Upper Case Latter");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Its Lower Case Latter");
		} else {
			System.out.println("Char is Not Alphabet");
		}
	}

}
