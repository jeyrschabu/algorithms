package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;

//SRM 175
public class ClockWalk {
	public int finalPosition(String flips) {
		int remaining = 0, flipCount = 0, position = 0;
		for(int i = 0; i < flips.length(); i++){
			++flipCount;
			if(flips.charAt(i) == 'h')remaining = remaining + flipCount;
			else remaining = remaining - flipCount;
		}
		position = (12 + remaining) % 12;
		if(position == 0) return 12;
		return Math.abs(position);
	}
}
