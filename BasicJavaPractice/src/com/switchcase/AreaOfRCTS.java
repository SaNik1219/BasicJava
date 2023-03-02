package com.switchcase;

import java.util.Scanner;
//Area of Reactangle,Circle,Triangle,Square.
public class AreaOfRCTS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();
		System.out.println("choose option from below which you want to find out Area of");
		System.out.println("Reactangle \t Circle \t Triangle \t Square");

		/*
		 * Area Of Reactangle= width*length Area of Circle = 3.14*r*r Area of Triangle =
		 * 0.5*height*base Area of Square= side*side
		 */

		char ar = sc.next().charAt(0);

		switch (ar) {
		case 'r':
			System.out.println("Area of Rectangle=" + (num1 * num2));
			break;

		case 'c':
			System.out.println("Area of Circle=" + (3.14 * num1 * num1));
			break;

		case 't':
			System.out.println("Area of Triangle=" + (0.5 * num1 * num2));
			break;

		case 's':
			System.out.println("Area of Square=" + (num1 * num2));
			break;

		default:
			System.out.println("Invalid");
		}

	}

}
