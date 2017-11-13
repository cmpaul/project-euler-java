package com.example.euler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author chris
 *
 */
class Solution004Test {

	@Test
	void test() {
		assertEquals(9009, Solution004.findLargestPalindrome(2));
		System.out.println("Solution 004 = " + Solution004.findLargestPalindrome(3));
	}

}
