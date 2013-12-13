package com.jeyrs.algorithms.topcoder.div2;

//SRM 188
import java.util.*;
public class MagicSquare {
	public int missing(int[] square) {
		int res[] = new int[3];
		for(int i = 0; i <= 2; i++)
			res[0] += square[i];
		for(int i = 3; i <= 5; i++)
			res[1] += square[i];
		for(int i = 6; i < square.length; i++)
			res[2] += square[i];
		Arrays.sort(res);
		
		return res[2] - res[0] - 1;
	}
}
