package com.example.euler;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * 
 * @author chris
 *
 */
class Solution002Test {

	@Test
	void test() {
		assertEquals(Arrays.asList(1L, 2L, 3L, 5L, 8L), Solution002.getFibSequence(10));
		System.out.println("Solution 002 = " + Solution002.getEvenFibonacciSum());
	}

}
