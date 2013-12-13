package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;

//SRM 196
public class Education {
	public int minimize(String desire, int[] tests) {
		int req = 0;
		if(desire.equals("A"))req = 90;
		if(desire.equals("B"))req = 80;
		if(desire.equals("C"))req = 70;
		if(desire.equals("D"))req = 60;
		
		req *= tests.length + 1;
		int sum = 0;
		for(int x : tests) sum +=x;
		for(int i=0; i <=100; ++i)
			if(i + sum >= req) return i;
		return -1;
	}
}

