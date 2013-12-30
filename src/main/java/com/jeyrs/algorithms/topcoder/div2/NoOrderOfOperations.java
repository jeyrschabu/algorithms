package com.jeyrs.algorithms.topcoder.div2;

public class NoOrderOfOperations {
	public int evaluate(String expr){
		int ans = expr.charAt(0) - '0';
		for(int i=1; i < expr.length(); i+=2){
			char op = expr.charAt(i);
			int digit = expr.charAt(i + 1) - '0';
			if(op == '+') ans +=digit;
			if(op == '-') ans -=digit;
			if(op == '/') ans /=digit;
			if(op == '*') ans *=digit;
		}
		return ans;
	}
}
