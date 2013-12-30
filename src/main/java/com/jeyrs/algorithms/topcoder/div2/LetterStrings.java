package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
//SRM 202
public class LetterStrings {
	public int sum(String[] s) {
		int ans = 0;
		for(String str : s){
			str = str.replaceAll("\\W", "");
			ans +=str.length();
		}
		return ans;
	}
}
