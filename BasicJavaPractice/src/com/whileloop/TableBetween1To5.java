package com.whileloop;

import java.util.Scanner;

public class TableBetween1To5 {
//table from 1 to 10
	public static void main(String[] args) {

		for (int n = 1; n <= 10; n++) {
			for (int i = 1; i <= 10; i++) {

				System.out.println(n + " * " + (i) + " = " + (n * (i)));
			}
			System.out.println("----------");
		}
	}
}
