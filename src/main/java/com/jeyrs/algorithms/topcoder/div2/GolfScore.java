package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
//SRM #186
public class GolfScore {
	public int tally(int[] parValue, String[] scoreSheet) {
		int total = 0;

		for(int i = 0; i < parValue.length; i++){
			int current = 0;
			if(scoreSheet[i].equals("double bogey")){
				current = parValue[i] + 2;
			}else if(scoreSheet[i].equals("bogey")){
				current = parValue[i] + 1;
			}else if(scoreSheet[i].equals("par")){
				current = parValue[i];
			}else if(scoreSheet[i].equals("birdie")){
				current = parValue[i] - 1;
			}else if(scoreSheet[i].equals("eagle")){
				current = parValue[i] - 2;
			}else if(scoreSheet[i].equals("albatross")){
				current = parValue[i] - 3;
			}else if(scoreSheet[i].equals("hole in one")){
				current =  1;
			}else if(scoreSheet[i].equals("triple bogey")){
				current = parValue[i] + 3;
			}
			total += current;
		}
		return total;
	}
}