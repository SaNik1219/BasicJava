package com.loops;

import java.util.Scanner;
////////////////how to do table of 5.///////////
public class Tableof5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(n + "*" + i + "=" + n * i);

		}
	}

}
