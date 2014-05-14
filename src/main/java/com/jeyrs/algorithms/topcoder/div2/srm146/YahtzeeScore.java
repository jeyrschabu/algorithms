package com.jeyrs.algorithms.topcoder.div2.srm146;

import java.util.*;

//SRM 146 250
public class YahtzeeScore {
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
}
