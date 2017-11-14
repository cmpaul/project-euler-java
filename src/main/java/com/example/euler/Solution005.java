package com.example.euler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 * 
 * @author chris
 *
 */
public class Solution005 {

	public static long getSmallestDivisible(int n) {
		long result = (long) n;
		boolean found = false;
		do {
			result++;
			for (int i = 2; i <= n; i++) {
				if (result % i != 0) {
					found = false;
					break;
				}
				found = true;
			}
		} while (!found);
		return result;
	}
}
