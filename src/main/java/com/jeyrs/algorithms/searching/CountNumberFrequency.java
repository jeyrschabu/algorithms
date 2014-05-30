package com.jeyrs.algorithms.searching;

/**
 * count number frequency in a sorted array with dups
 * use binary search
 */
public class CountNumberFrequency {
	public static void main(String [] args){
		int x[] = new int[]{1,2,3,4,4,4,5};
		int n = 4;
		System.out.println(countNumberFrequency(n,x, 0, x.length-1));
	}
	
	//use bynary search, potentially O(nlgn)
	public static int countNumberFrequency(int key, int [] numbers, int low, int high){
		if(high < low)return 0;
		
		if(numbers[low] > key) return 0;
		if(numbers[high] < key) return 0;
		
		if(numbers[low] == key && numbers[high] == key) return high - low + 1; //means all items are the same
		
		int mid = (low + high)/2;
		
		if(numbers[mid] == key)
			return 1 + countNumberFrequency(key, numbers, low, mid-1) + countNumberFrequency(key, numbers, mid+1, high);
		else if(numbers[mid] > key)
			return countNumberFrequency(key, numbers, low, mid -1);
		else
			return countNumberFrequency(key, numbers, mid+1, high);
		
	}
	//iterative potentially O(n)
	public static int countNumberFrequency(int n, int []x){
		int counter = 0;
		for(int i=0; i < x.length; i++)
			if(x[i] == n) counter++;
		return counter;
	}
}
