package com.basic.java;

public class UranaryOperator {

	public static void main(String[] args) {
		int a = 2;
		int b = 2;

		int x = a++ + b++;
		System.out.println(x + " " + a + " " + b);

		int x1 = ++a - ++b;
		System.out.println(x1 + " " + a + " " + b);

		int x2 = --a - --b;
		System.out.println(x2 + " " + a + " " + b);

		int x3 = a++ + ++b + a;
		System.out.println(x3 + " " + a + " " + b);

		int x4 = a-- - --b - --a;
		System.out.println(x4 + " " + a + " " + b);
	}
}
