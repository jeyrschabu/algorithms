package com.jeyrs.algorithms;

import java.util.ArrayList;
import java.util.List;

public class NumberStuff {
	public static void main(String [] args){
		//System.out.println(getSumOfEvenFibonacci());
		//long n = 600851475143L;
		//getPrimeFactors(n);
		System.out.println(getLargestPalendromeFromProduct());
		System.out.println(getLowestDivisible(20));
		
	}
	public static int getSumOfEvenFibonacci(){
		int limit = 4000000;
		int n = 0;
		while(true){
			if(fib(n) > limit)
				break;
			n++;
		}
		n--;
		int sum = (fib(n + 2) - 1)/2;
		return sum; 
		/**
		 *  So your sum S = F3+F6+F9+...+F(3n) = (F1+F2) + (F4+F5) + (F7+F8)+...+(F(3n--2)+F(3n-1)) = T,
		 *  but S+T = F(3n)+F(3n-1)+...+F2+F1 = F(3n+2)-F1. 
		 *  Which give the neat formula S = 1/2(F(3n+2)-1).
		 *  F(33) = 3,524,578 is the last even fibonacci number before 4,000,000.
		 *  So your sum = 1/2(F(35)-1) = 1/2(9,227,465-1) = 4,613,732.
		 */
	}//4613732
	public static int fib(int n){
		if(n == 0 || n == 1)return n;
		return fib(n-2) + fib(n-1);
	}
	public static void getPrimeFactors(long n){
		boolean [] primes = sieveOfEratosthenes(n);
		int max = 0;
	    for(int i=0; i<primes.length; i++){
	        if(primes[i]==true && n % i == 0){
	            if(max < i)max = i;
	        }
	    }
	    System.out.println(max);
	}
	private static boolean[] sieveOfEratosthenes(long max){
	    boolean[] primeCandidates = new boolean[1000000]; //defaults to false
	    
	    for(int i=2; i<primeCandidates.length; i++ ){
	    	primeCandidates[i]=true;
	    }
	    for(int i=10; i<Math.sqrt(max);i++){
	        if(primeCandidates[i] == true){
	            for(int j = i + i; j<primeCandidates.length; j=j+i){
	                primeCandidates[j]=false;
	            }
	        }
	    }
	    return primeCandidates;
	}
	/*
	 * The palendrome from product of two 3 digits integers
	 */
	public static int getLargestPalendromeFromProduct(){
		int limit = 1000;
		List<Integer> palendromes = new ArrayList<Integer>();
		int p = 0;
		for(int i=100; i < limit; i++)
			for(int j = 100; j < limit; j++){
				p = i * j;
				if(isPalindrome(p) && !palendromes.contains(p))
					palendromes.add(p);
			}
		return getMax(palendromes);
		
	}
	private static int getMax(List<Integer> nums){
		int max = nums.get(0);
		for(int i = 1; i < nums.size(); i++)
			if(nums.get(i) > max)
				max = nums.get(i);
		return max;
	}
	private static boolean isPalindrome(int p) {
		int[] a = new int[6];
		int tmp = p;
		for(int i=0;i <a.length; i++){
			a[i]=tmp%10;
			tmp /=10;
			if(tmp == 0)
				break;
		}
		for(int i = 0; i < a.length; i++){
			if(a[i] != a[a.length -1 - i]){
				return false;
			}
		}
		return true;
	}
	/**
	 * get the lowest digit divisible by 1 to 10
	 * @return
	 */
	public static int getLowestDivisible(int n){
		for(int i=1; i > 0; i++)
			for(int j = 1; j <= n; j++){
				if(i % j != 0)
					break;
				if(j == n)
					return i;
			}
		return -1;
	}
}
