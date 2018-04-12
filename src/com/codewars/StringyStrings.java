package com.codewars;

public class StringyStrings {

	public static void main(String[] args) {
		stringy(7);
	}
	public static String stringy(int size) {
		String str = "";
		StringBuilder builder = new StringBuilder();
		if(size % 2 == 0) {
			for (int i = 0; i < size; i+=2) {
				builder.append("10");
//				builder.append('0');
				str = builder.toString();
			}
		} else {
			for (int j = 0; j < size - 1; j += 2) {
				builder.append("10");
			}
			builder.append("1");
		}
		str = builder.toString();
		System.out.println(str);
		return str;
	}

}
