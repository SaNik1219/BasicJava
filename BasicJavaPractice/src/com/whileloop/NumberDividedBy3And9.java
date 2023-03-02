package com.whileloop;

public class NumberDividedBy3And9 {
//display num between 1 to 20 if the num is divided by 3 & 9 then stop there
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				break;
			} else if (i % 9 == 0) {
				break;
			} else {
				System.out.print(i + " ");
			}
		}

	}

}
