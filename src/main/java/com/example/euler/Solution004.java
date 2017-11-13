package com.example.euler;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author chris
 *
 */
public class Solution004 {

	/**
	 * Returns true if the number given is a palindrome.
	 * 
	 * @param n
	 * @return boolean
	 */
	public static boolean isPalindrome(long n) {
		long i = n; // 1234
		int position = 0;
		long reversed = 0L; 
		while (i != 0) {
			// Take the last digit and update reversed
			reversed = reversed * 10 + (i % 10);
			if (position == 0 && reversed == 0) {
				// A palindrome can never end in a 0
				return false;
			}
			// Chop it off so we can process the next digit
			i = Math.floorDiv(i, 10);
			position++;
		}
		return reversed == n;
	}

	/**
	 * Brute force implementation.
	 * 
	 * Find the largest palindrome made by numbers with digits number of digits.
	 * 
	 * @param digits
	 * @return long
	 */
	public static long findLargestPalindrome(int digits) {
		long maxPalindrome = 0L;
		if (digits > 0) {
			// Find bounds
			int max = (int) Math.pow(10, digits) - 1;
			int min = (int) Math.pow(10, digits - 1) + 1;

			for (int i = min; i <= max; i++) {
				if (i % 10 == 0) { continue; }
				for (int j = i; j <= max; j++) {
					if (j % 10 == 0) { continue; }
					long product = i * j;
					if (isPalindrome(product) && product > maxPalindrome) {
						maxPalindrome = product;
					}
				}
			}
		}
		return maxPalindrome;
	}
}
