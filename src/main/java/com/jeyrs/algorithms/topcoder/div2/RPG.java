package com.jeyrs.algorithms.topcoder.div2;

public class RPG {
	public int[] dieRolls(String[] dice) {
		int [] a = new int[3];
		double min = 0, max = 0, avg = 0;

		for(String d : dice){
			double f = Double.parseDouble(d.split("[a-zA-Z]")[0]);
			double l = Double.parseDouble(d.split("[a-zA-Z]")[1]);
			min += f;
			max += f*l;
			avg += f *(1 + l)/2;

		}
		a[0] = (int)min;
		a[1] = (int)max;
		a[2] = (int)avg;

		return a;
			
	}
}
