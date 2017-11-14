package com.example.euler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * The sum of the squares of the first ten natural numbers is:
 * 
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is:
 * 
 * (1 + 2 + ... + 10) ^2 = 552 = 3025
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
class Solution006Test {

	@Test
	void test() {
		assertEquals(2640L, Solution006.getDifference(10));
		System.out.println("Solution 006 = " + Solution006.getDifference(100));
	}

}
