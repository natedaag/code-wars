package com.codewars;

public class NearestSquare {
	
	public static void main(String[] args) {
		nearestSq(7);
	}

	public static int nearestSq(int n) {
		int prevSqRt = (int) Math.sqrt(n);
		int nextSqRt = (int) (Math.sqrt(n) + 1);
		int prevSq = prevSqRt * prevSqRt;
		int nextSq = nextSqRt * nextSqRt;
		int nearSq;
		if((n - prevSq) < (n - nextSq)) {				
			nearSq = prevSq;
		} else {
			nearSq = nextSq;
		}
		System.out.println(nearSq);
		return nearSq;
	}

}
