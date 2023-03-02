package com.conditions;

import java.util.Scanner;

public class Condition6 {
//////////////////////Greater Number Between 3 Numbers////////////////////
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1 = sc.nextInt();

		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();

		System.out.println("Enter Third Number:");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 < num3) {
			System.out.println(num1 + " is Largest Number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is Largest Number");
		} else {
			System.out.println(num3 + " is Largest Number");
		}

////////////////////////////////////////////////////////////////////////

		if (num1 > num2) {
			if (num2 > num3) {
				System.out.println("Num1 is Greater");
			} else{
				System.out.println("Num3 is Greater");
			}
			}else if (num2 > num3) {
				System.out.println("Num2 is Greater");
			} else {
				System.out.println("num3 is Greater");
			}
		
		}
	}
