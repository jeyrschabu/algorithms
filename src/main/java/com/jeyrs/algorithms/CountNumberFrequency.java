package com.jeyrs.algorithms;

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
	public static int countNumberFrequency(int n, int [] x, int start, int end){
		if(end < start)return 0;
		if(x[start] > n) return 0;
		if(x[end] < n) return 0;
		
		if(x[start] == n && x[end] == n) return end - start + 1; //means all items are the same
		int mid = (start + end)/2;
		if(x[mid] == n)
			return 1 + countNumberFrequency(n, x, start, mid-1) + countNumberFrequency(n, x, mid+1, end);
		else if(x[mid] > n)
			return countNumberFrequency(n, x, start, mid -1);
		else
			return countNumberFrequency(n, x, mid+1, end);
		
	}
	//iterative potentially O(n)
	public static int countNumberFrequency(int n, int []x){
		int counter = 0;
		for(int i=0; i < x.length; i++)
			if(x[i] == n) counter++;
		return counter;
	}
}
