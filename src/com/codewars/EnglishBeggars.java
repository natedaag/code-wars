package com.codewars;

public class EnglishBeggars {

	public static void main(String[] args) {
		int[] value = {1, 2, 3, 4};
		beggars(value, 2);
	}
	
	public static int[] beggars(int[] values, int n) {
		int[] begged = new int[n];
		for (int i = 0; i < values.length; i += n) {
			
//			begged[i] = ;
		}
		return begged;
		
	}
}
/* 
 * take the int - the second input.  first number in the array plus
 * that - total those numbers of the array, that's the first number
 * in the return array.  then the second number, plus the int, and 
 * so on.
 */
