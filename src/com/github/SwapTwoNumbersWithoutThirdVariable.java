package com.github;

public class SwapTwoNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		int a = 3, b = 6;
		System.out.println("Before swapping :" + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping :" + a + " " + b);
	}

}
