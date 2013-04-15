package com.jeyrs.algorithms;

/**
 * return the first index of a number in a sorted array allowing duplicates
 *
 */
public class SortedArrayIndexOf {
	public static void main(String [] args){
		int x[] = new int[]{1,2,2,2,4,4};
		int n = 4;
		System.out.println(sortedArrayIndexOf(n, x, 0, x.length));
	}
	public static int sortedArrayIndexOf(int n, int []x, int start, int end){
		int len = x.length;
		if(len == 0) return -1;
		if(x[start] == n) return start;
		if(x[start] > n) return -1;
		
		int mid = (start + end)/2 ;
		
		if(mid == len-1) return -1;
		
		if(x[mid] == n){
			while(x[mid] == n)
				mid--;
			return mid + 1;
		}else if(x[mid] < n)
			return sortedArrayIndexOf(n, x, mid+1, end);
		else if(x[mid] > n)
			return sortedArrayIndexOf(n, x, start, mid-1);
		return -1;
	}
	
}
