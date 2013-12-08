package com.jeyrs.algorithms.topcoder.div2;

//SRM 183
import java.util.*;
public class CountGame {
	public int howMany(int maxAdd, int goal, int next) {
		goal = goal - next + 1;
		while(goal> maxAdd)
			goal = goal - maxAdd - 1;
		return goal == 0 ? -1 : goal;
		
	}
}
