package com.looppattern;

public class Pattern8 {

	public static void main(String[] args) {
		for (char i = 'D'; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
