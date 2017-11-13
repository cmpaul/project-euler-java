package com.example.euler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author chris
 *
 */
class Solution003Test {

	@Test
	void test() {
		assertEquals(29L, Solution003.getLargestPrimeFactor(13195L));
		System.out.println("Solution 003 = " + Solution003.getLargestPrimeFactor(600851475143L));
	}

}
