package com.codewars;

public class DivisibleNB {

	public static void main(String[] args) {
		isDivisible(5, 1, 3);
	}
	public static boolean isDivisible(long n, long x, long y) {
		boolean divides = false;
		long i = n % x; 
		long j = n % y;
		if(i == 0 && j == 0) {
			divides = true;
		}
		
		System.out.println(divides);
		return divides;
	}

}
