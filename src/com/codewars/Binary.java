package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binary {
	public static void main(String...strings ) {
		convertBinaryArrayToInt(new ArrayList<Integer>(Arrays.asList(0,1,0,1)));
	}

    public static int convertBinaryArrayToInt(List<Integer> binary) {
    	String binInt0 = "";
    	String binInt1 = "0b";
    	for (int i = 0; i < binary.size(); i++) {
    		binInt0 += binary.get(i);
    	}
    	binInt1 += binInt0;
//    	int answer = Integer.parseInt(binInt1);
    	int number = 0b11;
//    	int number1 = Integer.parseUnsignedInt(number);
    	System.out.println(number);
    	return 0;//Integer.parseInt(binInt);
    }
}
