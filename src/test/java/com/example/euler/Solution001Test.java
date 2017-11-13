package com.example.euler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author chris
 *
 */
class Solution001Test {

	@Test
	void test() {
		assertEquals(23, Solution001.sumOfMultiples(10));
		System.out.println(Solution001.sumOfMultiples(1000));
	}

}
