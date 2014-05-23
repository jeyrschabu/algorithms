package com.jeyrs.algorithms.topcoder.div2.srm149;

public class BigBurger{
	public int maxTime(int arrival[], int service[]){
		
		int t = 0;
		int max = 0;
		
		for(int i = 0; i < arrival.length; i++){
			if(arrival[i] > t)t=arrival[i];
				max = Math.max(max, t-arrival[i]);
			    t += service[i];
			}
		return max;
	}
}
