package com.jeyrs.algorithms.topcoder.div2.srm145;

import java.util.*;

//SRM 145 250
public class ImageDithering {
	public int count(String dithered, String[] screen) {
		int count = 0;
		for(int i = 0; i < dithered.length(); i++){
			char d = dithered.charAt(i);
			for(String s : screen){
				for(int j = 0; j < s.length(); j++)
					if(d == s.charAt(j)) count++;
			}
		}
		return count;
	}
}

