package com.jeyrs.algorithms.topcoder.div2;

import java.util.Arrays;

//SRM 208
public class ImageDithering {
	public int count(String dithered, String[] screen) {
		int count = 0;
		System.out.println(Arrays.toString(screen));
		for(int i = 0 ; i < dithered.length(); i++){
			char f = dithered.charAt(i);
			for(int j = 0; j < screen.length; j++){
				for(char c : screen[j].toCharArray())
					if(f == c) count++;
			}
		}
		return count;
	}
}
