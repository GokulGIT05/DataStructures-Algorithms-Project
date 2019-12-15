package com.gk01.Recursion;

public class Gk3FibonacciNumber {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(recursiveWay(i));
		}
	}

	private static int recursiveWay(int input) {
		
		if(input<0) {
			return -1;
		}
		if (input == 1 || input == 2) {
			System.out.println("inside: " + input);
			return 1;
		}
		System.out.println("Outside " + input);
		int first = recursiveWay(input - 1);

		System.out.println("End of First: " + first);
		int Second = recursiveWay(input - 2);
		System.out.println("End of Second: " + Second);
		return first + Second;
	}
}
