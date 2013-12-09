package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
public class KiloMan {
	public int hitsTaken(int[] pattern, String jumps) { 
		int hits = 0;
		for(int i = 0; i < pattern.length;i++ ){
			if((jumps.charAt(i) == 'S' && (pattern[i] == 1 || pattern[i] == 2))) hits++;
			if((jumps.charAt(i) == 'J' && pattern[i] > 2)) hits++;
		}
		return hits;
	}
}

