package com.codewars;

import java.util.Arrays;

public class Kata {

	public static void main(String[] args) {
		isAnagram("foeTfe", "toffeE");
	}
	
	public static boolean isAnagram(String test, String original) {
		boolean anagram = false;
		// test = test.toLowerCase(); //
		// char[] testArray = test.toCharArray();
		// char[] origArray = original.toCharArray();
		char[] testArray = test.toLowerCase().toCharArray();
		char[] origArray = test.toLowerCase().toCharArray();
		original = original.toLowerCase();
		Arrays.sort(testArray);
		Arrays.sort(origArray);
		String newTest = new String(testArray);
		String newOrig = new String(origArray);
			if(newTest.equals(newOrig)) {
				anagram = true;
			}
		System.out.println(newTest);
		System.out.println(newOrig);
		System.out.println(anagram);

		return anagram;
	}
		
}
/*
 * b b
u u
c c
k k
e e
e e
t t
h h
a a
d d
*/