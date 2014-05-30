package com.jeyrs.algorithms.searching;

public class BinarySearch {
	public int binarySearch(int numbers[], int key, int low, int high){
		if(low > high) return -1;
		int middle = (high + low)/2;
		
		if(numbers[middle] == key) return numbers[middle];
		if(numbers[middle] > key) return binarySearch(numbers, key, low, middle -1);
		else
			return binarySearch(numbers, key, middle + 1, high);
		
	}
}
