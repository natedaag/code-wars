package com.codewars;

import java.util.Arrays;

public class Kata {

	public static void main(String[] args) {
//		isAnagram("foeTfe", "toffeE");
//		String[] cards = {"QD", "4D", "10D", "KD", "5D"};
//		checkIfFlush(cards);
//		rps("rock", "paper");
//		hexToDec("10");
//		dashatize(1);
//		squareUp(2) => [0, 1, 2, 1];
	}



	/* the stupid codewars says this is wrong, but doesn't say why.
	 * the instructions say make it return with dashes around odd numbers,
	 * unless they're at position 0 or length()-1.
	 * mine does that, but codewars says it's wrong.
	 * if it's not in the instructions, i don't know how to fix it.
	*/
	public static String dashatize(int num) {
		Integer numOne = Integer.valueOf(num);
		String dashatized = numOne.toString();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < dashatized.length(); i++) {
			if (dashatized.charAt(i) % 2 == 1) {
				sb.append("-" + dashatized.charAt(i) + "-");
			} else {
				sb.append(dashatized.charAt(i));
			}
		}
		for (int i = 0; i < sb.length()-1; i++) {
			if(sb.charAt(0) == '-') {
				sb.deleteCharAt(0);
			}
			if (sb.charAt(sb.length() - 1) == '-') {
				sb.deleteCharAt(sb.length() - 1);
			}
			if(sb.charAt(i) == '-' && sb.charAt(i + 1) == '-') {
				sb.deleteCharAt(i);
			}
		}
		dashatized = sb.toString();
		System.out.println(dashatized);
		return dashatized;
		
	}
	
	static int hexToDec(final String hexString) {
		int returned = Integer.parseInt(hexString, 16);
		System.out.println(returned);
		return (int) returned;
	}

	private static String rps(String p1, String p2) {
		String winner = "";
		if (p1.equals(p2)) {
			winner = "Draw!";
			System.out.println(winner);
		}  else if (p1.equals("scissors") && p2.equals("paper")
				|| p1.equals("rock") && p2.equals("scissors")
				|| p1.equals("paper") && p2.endsWith("rock")) {
			winner = "Player 1 won!";
		} else {
			winner = "Player 2 won!";
		}
		System.out.println(winner);
		return winner;
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
