package com.codewars;

public class SequenceSum {

	public static void main(String[] args) {
		showSequence(6);
	}

	static String showSequence(int value) {
		if (value < 0) {
			return "" + value + "<0";
		} else if (value == 0) {
			return "0=0";
		} else {
		String sequence = "";
		int j = 0;
		for (int i = 0; i < value; i++) {
			j = j + i;
			sequence += sequence.valueOf(i) + "+";
		}
		j += value;
		sequence += value + " = " + j;
		System.out.println(sequence);
		return sequence;
		}
	}

}
