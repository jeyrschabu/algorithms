package com.jeyrs.algorithms.topcoder.div2;
//SRM 198
import java.util.*;
public class Reppity {
	public static void main(String args[]){
		int s = new Reppity().longestRep("ABCDEXXXYYYZZZABCDEZZZYYYXXX");
		System.out.println(s);
	}
	public int longestRep(String input) {
		int ans = 0;
		
		for(int i=0; i < input.length(); i++)
			for(int j = i+ 1; j <= input.length(); j++)				
				ans = Math.max(ans, length(input, i, j));
		return ans;
	}
	private int length(String x, int a, int b){
		int aa = a, bb = b, ans = 0;
		while(aa < b && bb < x.length() && x.charAt(aa++) == x.charAt(bb++)){
			ans++;
		}
		return ans;
	}
}