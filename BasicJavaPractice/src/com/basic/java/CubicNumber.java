package com.basic.java;

import java.util.Scanner;

public class CubicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num;
		num = sc.nextInt();
		num = num * num * num;
		System.out.println("Cubic Number is:" + num);
	}

}
