package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;

//SRM #189
public class CutoffRounder {
	public int round(String num, String cutoff) {
		String [] a = num.split("\\.");
		if(a[0].equals(""))a[0]="0";
		if(a[1].equals(""))a[1]="0";
		int value = Integer.parseInt(a[0]);
		int fraction = Integer.parseInt(a[1]);
		
		int r = Integer.parseInt(cutoff.split("\\.")[1]);
		if(Math.max(fraction, r) >= fraction ) value++;
		return value;
	}
	public int round0(String num, String cutoff) {
		return (int) (Double.parseDouble(num) + 1 - Double.parseDouble(cutoff));
	}
	public int round1(String num, String cutoff) {
		double n = Double.parseDouble(num);
		double c = Double.parseDouble(cutoff);
		if(n - (int) n >= c) return (int) n + 1;
		return (int) n;
	}
}