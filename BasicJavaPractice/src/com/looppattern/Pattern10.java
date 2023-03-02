package com.looppattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {

		for (char i = 'A'; i <= 'D'; i++) {
			for (char j = 'A'; j <= 'D'; j++) {
				if (i >= 'B' && j >= 'B' && i <= 'C' && j <= 'C') {
					System.out.print(" ");
				} else {
					System.out.print(j);
				}
			}

			System.out.println();
		}

	}
}
