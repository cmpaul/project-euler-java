package com.example.euler;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author chris
 *
 */
public class Solution003 {

	public static long getLargestPrimeFactor(long n) {
		long current_divisor = n;
		long max_factor = 0L;
		for (long i = 2; i <= current_divisor; i++) {
			if (current_divisor % i == 0) {
				if (i > max_factor) {
					max_factor = i;
				}
				current_divisor /= i;
			}
		}
		return max_factor;
	}
}
