package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
public class StringMult {
	public String times(String sFactor, int iFactor) {
		if(sFactor.equals("")) return "";
		if(iFactor == 0) return "";
		if(iFactor < 0){
			char [] a = sFactor.toCharArray();
			int index = 0;
			for(int i = sFactor.length() - 1; i >= 0; i--){
				a[index++] = sFactor.charAt(i);
			}
			sFactor = new String(a);
		}
		String ret = "";
		for(int i=0; i < Math.abs(iFactor); i++)
			ret +=sFactor;
		return ret;
	}
}

