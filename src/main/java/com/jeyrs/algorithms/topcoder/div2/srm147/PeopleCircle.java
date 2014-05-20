package com.jeyrs.algorithms.topcoder.div2.srm147;

import java.util.Arrays;

//SRM 147 600
public class PeopleCircle {
	public static void main(String args[]){
		int m = 5, f = 3, k = 2;
		PeopleCircle pc = new PeopleCircle();
		String o = pc.order(m, f, k);
		String o1 = pc.order0(m, f, k);
		String o2 = pc.order1(m, f, k);
		System.out.println(o);
		System.out.println(o1);
		System.out.println(o2);
		
		char d = '5';
		int intd = d - '0';
		
		System.out.println(intd);
		
	}
	public String order1(int m, int f, int k){
		int len = m + f;
		char [] chars = new char[len];
		for(int i=0; i < len; i++)
			chars[i] = 'M';
		int pos = chars.length - 1;
		for(int i = 0; i < f; i++){
			for(int j = 0; j < k;){
				pos = (pos + 1) % chars.length;
				if(chars[pos] == 'M')j++;
			}
			chars[pos] = 'F';
		}
		return new String(chars);
	}
	public String order0(int m, int f, int k){
		char chars[] = new char[m + f];
		int current = k;
		int total = f;
		int start = 0;
		
		//this places all the F first
		while(total > 0){
			if(chars[start] != 'F')current--;
			if(current == 0){
				chars[start] = 'F';
				current = k;
				total--;
			}
			start = (start + 1) % (m + f);
		}
		for(int i = 0 ; i < m + f; i++){
			if(chars[i] != 'F')chars[i]='M';
		}
		return new String(chars);
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
