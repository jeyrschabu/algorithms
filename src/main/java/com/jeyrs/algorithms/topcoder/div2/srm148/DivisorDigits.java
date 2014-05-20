package com.jeyrs.algorithms.topcoder.div2.srm148;

import java.util.*;

//SRM 148 200
public class DivisorDigits {
	public int howMany(int number) {
		String s = String.valueOf(number);
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			int d = Integer.parseInt(s.charAt(i) + "");
			if(d != 0 && number % d == 0)count++;
		}
		return count;
	}
	public int howMany0(int number){
		int count = 0;
		for(char c : String.valueOf(number).toCharArray()){
			int val = c - '0';
			if(val != 0 && number % val == 0)count++;
		}
		return count;
	}
}
