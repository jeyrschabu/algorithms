package com.jeyrs.algorithms.topcoder.div2;

//SRM 165
public class BritishCoins{
	public int[] coins(int pence){
		int a[] = new int[3];
		a[0] = pence/240;
		int r = pence % 240;
		a[1] = r/12;
		a[2] = r%12;
		return a;
	}
}