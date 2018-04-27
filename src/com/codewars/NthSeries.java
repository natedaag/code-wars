package com.codewars;

public class NthSeries {

	public static void main(String[] args) {
		seriesSum(15);
	}
	static String seriesSum(int n) {
		if (n == 0) {
			System.out.println("0.00");
			return "0.00";
		}else {
		Double denominator = -2.0d;
		Double d = 0.00d;
		for (int i = 0; i < n; i++) {
			denominator += 3;
			d += 1 / denominator;
		}
		d = (double) Math.round(d*100);
		d = d / 100;
		String str = "";
		str = String.valueOf(d);
		if(str.length() < 4) {
			str = str.concat("0");
		}
		System.out.println(str);
		return str;
		}
	}
}
			
			
