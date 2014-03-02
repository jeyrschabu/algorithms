package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
//SRM 205
public class Average {
	public int belowAvg(int[] math, int[] verbal) {
		double points[] = new double[math.length];
		double total = 0, average = 0;
		for(int i=0; i < math.length; i++){
			points[i] = math[i] + verbal[i];
			total +=points[i];
		}
		average = total/points.length; 
		int ans = 0;
		for(int i=0; i < points.length; i++){
			if(points[i] < average) ans++;
		}
		return ans;
	}
}

