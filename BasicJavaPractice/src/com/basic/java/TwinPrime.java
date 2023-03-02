package com.basic.java;

import java.util.Scanner;

public class TwinPrime {

	static boolean checkPrimeNumber(int number) {
		
		boolean isPrime = true;
		int halfnum= number / 2;

		for (int i = 2; i <=halfnum ; i++) {

			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

	// create checkTwinPrimeNumber() to check whether the numbers are twin prime or
	// not
	static boolean checkTwinPrimeNumber(int number1, int number2) {

		if ((number1 - number2) == 2) {

			boolean num1isPrimeNumber = checkPrimeNumber(number1);

			if (num1isPrimeNumber) {

				boolean num2isPrimeNumber = checkPrimeNumber(number2);

				if (num2isPrimeNumber) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	/* Driver program to test above function */
	public static void main(String[] args)  
    {  
         int number1, number2;  
          
        //create scanner class object to get input from user  
        Scanner sc = new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter first number");  
          
        //store user entered value into variable n1  
        number1 = sc.nextInt();  
          
        //show custom message  
        System.out.println("Enter second number");  
          
        //store user entered value into variable n2  
        number2 = sc.nextInt();  
        boolean isTwinPrimeNumber = checkTwinPrimeNumber(number1, number2);
          
        if (isTwinPrimeNumber)   
            System.out.println("("+number1 +", "+number2+ ") is a pair of twin primes");   
        else  
            System.out.println("("+number1 +", "+number2+ ") is not a pair of twin primes");   
          
    }

}
