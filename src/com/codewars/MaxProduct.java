package com.codewars;

public class MaxProduct {

	public static void main(String[] args) {
		int[] array = {-23, 4, -5, 99, -27, 329, -2, 7, -921};
		adjacentElementsProduct(array);
	}

	static int adjacentElementsProduct(int[] array) {
		int biggest = Integer.MIN_VALUE;
		for (int i = 1; i < array.length; i++) {
			if(array[i] * array[i-1] > biggest) {
				biggest = array[i] * array[i-1];
			}
		}
		System.out.println(biggest);
		return biggest;
	}

}
