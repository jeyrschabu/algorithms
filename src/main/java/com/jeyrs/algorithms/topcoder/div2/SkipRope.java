package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
public class SkipRope{
	public int[] partners(int[] candidates, int height){
	
		int a[] = new int[2];
		Arrays.sort(candidates);
		int index = 0;
		for(int i = 0; i < a.length; i++){
			int min = Math.abs(candidates[0] - height);
			for(int j= 0; j < candidates.length; j++){
				int tmpMin = Math.abs(candidates[j] - height);
				if(min > tmpMin){
					min = tmpMin;
					index = j;
				}
				if(min == tmpMin && candidates[j] > candidates[index]){
					index = j;
				}
			}	
			a[i] = candidates[index];
			candidates[index] = -100000;
		}
		Arrays.sort(a);
		return a;
	}

}
