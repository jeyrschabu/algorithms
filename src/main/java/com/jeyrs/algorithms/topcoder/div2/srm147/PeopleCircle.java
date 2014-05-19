package com.jeyrs.algorithms.topcoder.div2.srm147;

import java.util.Arrays;

public class PeopleCircle {
	public static void main(String args[]){
		int m = 5, f = 3, k = 2;
		String o = new PeopleCircle().order(m, f, k);
		System.out.println(o);
		
	}
	public String order(int m, int f, int k){
		char[] chars = new char[m + f];
		int cur = k;
		int mf = f;
		int start = 0;
		
		for(;mf > 0;){
			if(chars[start] != 'F')cur--;
			if(cur == 0){
				chars[start] = 'F';
				cur = k;
				mf--;
			}
			start = (start + 1) % (m + f);
		}
		print(chars);
		for(int i =0; i < m + f; i++){
			if(chars[i] != 'F')chars[i]='M';
		}
		return new String(chars);
	}
	private void print(char a[]){
		for(int i =0; i < a.length; i++){
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
