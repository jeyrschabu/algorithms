package com.jeyrs.algorithms.searching;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinarySearchTest{
	@Test
	public void binarySearch(){
		int numbers [] = new int[]{1,3,6,11,19,29};
		int key = 3;
		int value = new BinarySearch().binarySearch(numbers, key, 0, numbers.length);
		assertEquals(numbers[value], key);
	}
}
