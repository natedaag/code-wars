package com.codewars;

public class NumberFun {

	public static void main(String[] args) {
		findNextSquare(14);
	}
	
	public static long findNextSquare(long sq) {	
		double checkSquare = Math.sqrt(sq);
		int x = (int) checkSquare;
		if(Math.pow(checkSquare, 2) != Math.pow(x, 2)){
			System.out.print("-1");
			return -1;
		} else {
			long sqrt = (long) Math.sqrt(sq);
			long nextSquare = 0;
			sqrt++;
			nextSquare = sqrt * sqrt;
			System.out.println(nextSquare);
			return nextSquare;
		}
	}

}
