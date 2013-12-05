package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;

//SRM 176
public class RGBColor {
	public int[] getComplement(int[] rgb) {
		int r = 255 - rgb[0];
		int g = 255 - rgb[1];
		int b = 255 - rgb[2];
		
		if(Math.abs(rgb[0] - r) <= 32 && Math.abs(rgb[1] - g) <= 32 && Math.abs(rgb[2] - b) <= 32){
			r = rgb[0] + 128;
			g = rgb[1] + 128;
			b = rgb[2] + 128;
			
			if(r > 255)r = rgb[0] - 128;
			if(g > 255)g = rgb[1] - 128;
			if(b > 255)b = rgb[2] - 128;
		}
		return new int[]{r, g, b};
	}
}
