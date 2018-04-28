package com.codewars;

public class SmallestIntegerFinder {

	public static void main(String[] args) {
		int[] array = {100, 345, -1, -34};
		findSmallestInt(array);
	}
	
	public static int findSmallestInt(int[] array) {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		System.out.println(smallest);
		return smallest;
	}

}
