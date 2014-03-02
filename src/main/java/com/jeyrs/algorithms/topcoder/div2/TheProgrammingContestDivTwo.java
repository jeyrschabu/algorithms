package com.jeyrs.algorithms.topcoder.div2;

//SRM 502
import java.util.*;
public class TheProgrammingContestDivTwo {
	public int[] find(int T, int[] requiredTime) {
		Arrays.sort(requiredTime);
		int n = requiredTime.length, i, sum = 0, p = 0;
		for(i = 0; i < n; i++){
			sum += requiredTime[i];
			if(sum > T) break;
			p += sum;
		}
		return new int[]{i, p};
	}
}