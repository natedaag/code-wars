package com.codewars;

public class Printer {

	public static void main(String[] args) {
		String str = "aaabbbbhaijjjm";
		// 8/22;
				errorPrinter(str);
	}
	public static String errorPrinter(String str) {
		String returned = "";
		int bigCounter = 0;
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
		    char c = chars[i];
		    if(c <= 'm') {
		    	
		    }
		    if(c > 'm') {
		    	bigCounter++;
		    }
		}
		returned = "" + bigCounter + "/" + chars.length;
		System.out.println(returned);
		return returned;
	}
}
