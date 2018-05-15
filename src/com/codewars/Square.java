package com.codewars;

public class Square {
	
	public static void main(String...strings ) {
		isSquare(4);
	}
	public static boolean isSquare(int n) {
		boolean squareOrNot = false;
		double sqrt = Math.sqrt(n);
		int x = (int) sqrt;
		if (Math.pow(sqrt, 2) == Math.pow(x, 2)) {
			squareOrNot = true;
		}
		
		System.out.println(squareOrNot);
		return squareOrNot;
	}

}
