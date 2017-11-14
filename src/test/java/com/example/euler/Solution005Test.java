package com.example.euler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 * 
 * @author chris
 *
 */
class Solution005Test {

	@Test
	void test() {
		assertEquals(2520, Solution005.getSmallestDivisible(10));
//		System.out.println("Solution 005 = " + Solution005.getSmallestDivisible(20));
	}

}
