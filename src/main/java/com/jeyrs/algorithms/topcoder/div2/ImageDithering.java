package com.jeyrs.algorithms.topcoder.div2;

//SRM 145 div2 200
public class ImageDithering{
	public int count(String dithered, String[] screen){
		if(dithered == null || screen == null) return 0;
		if(dithered.length() < 2 || dithered.length() > 26) return 0;
		if(screen.length < 1 || screen.length > 50) return 0;
		int counter = 0;
		for(char c : dithered.toCharArray())
			for(String s2 : screen)
				for(char j : s2.toCharArray())
					if(j == c)counter++;
		return counter;
	}
}
