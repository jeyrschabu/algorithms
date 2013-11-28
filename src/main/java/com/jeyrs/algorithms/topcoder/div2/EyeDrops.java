package com.jeyrs.algorithms.topcoder.div2;

// SRM 167
public class EyeDrops {
	public double closest(int sleepTime, int k){
		if(24.0/ k < sleepTime){
			--k;
			int restDay = 24 - sleepTime;
			return restDay * 60.0 /k;
		}
		return 24.0 * 60 /k;
	}
}
