package com.codewars;

import java.util.Arrays;

public class Kata {

	public static void main(String[] args) {
		isAnagram("foeTfe", "toffeE");
		String[] cards = {"QD", "4D", "10D", "KD", "5D"};
//		"AD", "4S", "7H", "KS", "10S"
//		"AS", "3S", "9S", "KS", "4S"
//		"QD", "4D", "10D", "KD", "5D"
//		"AS", "3S", "9S", "KS", "4S"
		checkIfFlush(cards);
	}
	
	public static boolean checkIfFlush(String[] cards) {
		boolean isFlush = false;
		int counter = 0;
		for (int i = 1; i < cards.length; i++) {
			char str1 = cards[i].charAt(cards[i].length()-1);
			char str2 = cards[i-1].charAt(cards[i-1].length()-1);
			if(str1 == str2) {
				counter++;
			}
		}
		if(counter == 4) {
			isFlush = true;
		}
		System.out.println(isFlush);
		return isFlush;
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
//		System.out.println(newTest);
//		System.out.println(newOrig);
//		System.out.println(anagram);

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