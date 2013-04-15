package com.jeyrs.algorithms;

public class SubstringSearch {
	public static void main(String[] args){
		String txt = "Michelle";
		String pat = "e";
		System.out.println(substringSearchBruteForce(pat, txt));
	}
	public static int substringSearchBruteForce(String pattern, String txt){
		int m = pattern.length();
		int n = txt.length();
		
		for(int i= 0; i <= n - m; i++){
			int j;
			for(j = 0; j < m; j++)
				if(txt.charAt(i+j) != pattern.charAt(j))
					break;
			if(j == m) return i;
		}		
		return n;
	}
}
