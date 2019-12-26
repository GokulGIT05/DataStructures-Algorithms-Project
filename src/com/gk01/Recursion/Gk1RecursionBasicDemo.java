package com.gk01.Recursion;

public class Gk1RecursionBasicDemo {

	public static void main(String[] args) {

		recursionDemo(3);
		System.out.println("End of Main");

	}

	private static void recursionDemo(int i) {

		if (i < 1) {
			// System.out.println("End Of Recursive Method Call " + i);
			return; // 3rd point in Properties, should have end.
		}

		// System.out.println("Before Recurisive Value: " + i);
		recursionDemo(i - 1);
		System.out.println("After Recurisive Value: " + i);
	}

}
