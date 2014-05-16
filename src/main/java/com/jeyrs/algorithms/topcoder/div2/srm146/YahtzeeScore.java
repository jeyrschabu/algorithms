package com.jeyrs.algorithms.topcoder.div2.srm146;

import java.util.*;

//SRM 146 250
public class YahtzeeScore {
	public static void main(String args[]){
		long start = System.currentTimeMillis();
		int r = new YahtzeeScore().maxPoints(new int[]{ 2, 2, 3, 5, 4 });
		long end = System.currentTimeMillis();
		System.out.println("completed in " + (end - start));
		System.out.println("answer is " + r);
	}
	public int maxPoints(int[] toss) {
		int currentMax = 0;
		for(int i =0; i < toss.length; i++){
			int sum = toss[i];
			if(i < toss.length - 1)
				for(int j = i + 1; j < toss.length; j++){
					if(toss[j] == toss[i]){
						sum +=toss[j];
					}
				}
			currentMax = Math.max(sum, currentMax);
		}
		return Math.max(currentMax, toss[toss.length - 1]);
	}
	//alternative, this takes advantage of the constraints
	public int maxPoints0(int[] toss){
		int m[] = new int[7];
		for(int i : toss){
			m[i] +=i;
		}
		Arrays.sort(toss);
		return toss[toss.length - 1];	
	}
}
