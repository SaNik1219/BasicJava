package com.basic.java;

import java.util.Scanner;

public class CheckCode {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char:");
		char ch = sc.next().charAt(0);

		int x = ch;
		System.out.println(x);

	}

}
