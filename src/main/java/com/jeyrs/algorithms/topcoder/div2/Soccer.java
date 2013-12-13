package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
//SRM 194
public class Soccer {
	public int maxPoints(int[] wins, int[] ties) {
		int points[] = new int[wins.length];
		for(int i = 0 ; i < wins.length; i++){
			points[i] = 3*wins[i];
		}
		for(int i = 0 ; i < ties.length; i++){
			points[i] += ties[i];
		}
		Arrays.sort(points);
		return points[wins.length -1 ];
	}
	public int maxPoints0(int[] wins, int[] ties) {
		int max=-1;
		for(int i=0; i<=wins.length-1; i++)
			max=Math.max(max,3*wins[i]+ties[i]);

		return max;
	}
}
