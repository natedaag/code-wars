package com.codewars;

public class StringToNumber {

	public static void main(String[] args) {
		stringToNumber("1");
	}
	static int stringToNumber(String str) {
	    int result = Integer.parseInt(str);
		System.out.println(result);
		return result;
	}
}
