package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
//SRM 201
public class Multiples {
	public int number(int min, int max, int factor) {
		int ans = 0;
		for(int i = min ; i <= max; i++){
			if(i % factor == 0) ans++;
		}
		return ans;
	}
}
