package com.codewars;

public class ArithmeticFunction {

	public static void main(String[] args) {
		arithmetic(3,2,"add");
	}
	public static int arithmetic(int a, int b, String operator) {
		int mathedUpon = 0;
		switch (operator) {
		case ("add"):
			mathedUpon = a + b;
		break;
		case ("subtract"):
			mathedUpon = a - b;
		break;
		case("divide"):
			mathedUpon = a/b;
		break;
		case ("multiply"):
			mathedUpon = a*b;
		break;
		}
		
		
//		if(operator == "add") {
//			mathedUpon = a + b;
//		} else if(operator == "divide") {
//			mathedUpon = a / b;
//		} else if (operator == "subtract") {
//			mathedUpon = a - b;
//		} else if (operator == "multiply") {
//			mathedUpon = a * b;
//		}
//		System.out.println(mathedUpon);
		return mathedUpon;
	}
}


