package com.codewars;

public class XO {
	public static void main(String[] args) {
		getXO("XXxOo");
	}
  
	public static boolean getXO (String str) {
		str = str.toLowerCase();
		boolean evenSteven = false;
		int numX = 0;
		int numO = 0;
		for(int i = 0; i < str.length(); i++ ){
		    //temp = str.charAt(i);
		    if(str.charAt(i) == 'x') {
		        numX++;
		    }
		    if(str.charAt(i) == 'o') {
		    	numO++;
		    }
		}
		if(numX == numO) {
			evenSteven = true;
		} 
		System.out.println(evenSteven);
		return evenSteven;
	}
}