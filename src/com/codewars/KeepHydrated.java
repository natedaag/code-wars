package com.codewars;

public class KeepHydrated {

	public static void main(String[] args) {
		liters(6.7d);
	}
		
	public static int liters(double time) {
		int numberLiters = (int)(time * .5);
		return numberLiters;
	}

}
