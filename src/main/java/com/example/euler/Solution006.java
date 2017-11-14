package com.example.euler;

/**
 * The sum of the squares of the first ten natural numbers is:
 * 
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is:
 * 
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first
 * ten natural numbers and the square of the sum is:
 * 
 * 3025 − 385 = 2640
 * 
 * Find the difference between the sum of the squares of the first one
 * hundred natural numbers and the square of the sum.
 * 
 * @author chris
 *
 */
public class Solution006 {
	
	public static long getSumOfSquares(int n) {
		long sum = 0L;
		for (int i = 1; i <= n; i++) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}
	
	public static long getSquareOfSum(int n) {
		long sum = 0L;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return (long) Math.pow(sum, 2);
	}
	
	public static long getDifference(int n) {
		return getSquareOfSum(n) - getSumOfSquares(n);
	}
}
