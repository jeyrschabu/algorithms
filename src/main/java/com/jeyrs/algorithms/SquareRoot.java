package com.jeyrs.algorithms;
/**
 * Use binary search to calculate the sqrt
 * 0 < sqrt(a) < a
 * 0 < a <sqrt(a) if a < 1
 *
 */
public class SquareRoot {
	public static double sqrt(double n){
		if(n < 0) return -1;
		if(n == 0 || n == 1)
			return n;
		double start = 0, end = n, precision = 0.000001;
		if(end < 1) end = 1;
		while((end - start) > precision){
			double mid = (start + end)/2;
			double midSqr = mid*mid;
			if(midSqr == n) return mid;
			else if(midSqr < n) start = mid;
			else end = mid;
			
		}
		return (start+end)/2;
	}
	public static void main(String [] args){
		System.out.println(sqrt(4));
		System.out.println(sqrt(9));
		System.out.println(sqrt(30));
	}
}
