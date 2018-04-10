package com.codewars;

public class Scratch{
	public static int total = 10;
	public static void main(String[] args) {
		new Scratch();
	}
	public Scratch() {
		System.out.println("in test");
		System.out.println(this);
		int temp = this.total;
		if (temp > 5)
			System.out.println(temp);
	}
}
