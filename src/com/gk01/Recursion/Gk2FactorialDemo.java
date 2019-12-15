package com.gk01.Recursion;

public class Gk2FactorialDemo {

	public static void main(String[] args) {

		int factorial = toFindFactorial(5);
		System.out.println(factorial);
	}

	private static int toFindFactorial(int i) {

		if (i == 0) {
			return 1;
		}

		int value = i * toFindFactorial(i - 1);
		System.out.println("Before Return: " + value);
		return value;
	}

}
