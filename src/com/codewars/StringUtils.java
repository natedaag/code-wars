//Still Not Done!

package com.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	public static void main(String[] args) {
		toAlternativeString("heLLo woRLd");
	}
	  
	  public static String toAlternativeString(String str) {
		  Matcher m = Pattern.compile("(\\w)(\\w*)'(\\w)").matcher(str);
		  StringBuffer result = new StringBuffer();
		  while (m.find()) {
		      m.appendReplacement(result, m.group(1).toUpperCase() + m.group(2) + "'" + m.group(3).toUpperCase());
		  }
		  m.appendTail(result);
		  str = result.toString();  
		  System.out.println(str);
		  
//	    char[] array = str.toCharArray();
//	    for (int i = 0; i < array.length; i++) {
//	    	if(array[i].matches(".*\\S.*([A-Z]+)")) {
//	    		System.out.println("hi");
//	        }
//	    }
	    String altCase = "";
		return altCase;
	  }
	}
// alternating case

