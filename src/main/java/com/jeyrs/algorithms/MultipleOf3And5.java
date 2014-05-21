package com.jeyrs.algorithms;

public class MultipleOf3And5 {
	public static void main(String [] args){
		int n = 1000;
		System.out.println(sumOfMultipleOf3And5(n));
		
		//sum(3) + sum(5) - sum(15)\
		int sum = sumOfMultipleOf(3, 999) + sumOfMultipleOf(5, 999) - sumOfMultipleOf(15,999);
		
		System.out.println(sum);
		
	}
	//brute force inefficient O(n)
	public static int sumOfMultipleOf3And5(int n){
		int sum = 0;
		for(int i=0; i< n; i++){
			if(i % 3 == 0 || i % 5 ==0)
				sum +=i;
		}
		return sum;
	}
	private static int sumOfMultipleOf(int n, int target){
		int p = target/n;
		return n * (p*(p + 1))/2;
	}
}
