package com.jeyrs.algorithms.topcoder.div2;

//SRM 192
import java.util.*;
public class BoxLoader {
	public int mostItems(int boxX, int boxY, int boxZ, int itemX, int itemY, int itemZ) {
		int max = 0;
		int orientations[][] = new int[][]{
			{itemX, itemY, itemZ}, 
			{itemX, itemZ, itemY},
			{itemY, itemX, itemZ}, 
			{itemY, itemZ, itemX},
			{itemZ, itemX, itemY}, 
			{itemZ, itemZ, itemX},
		};
		for(int o[] : orientations){
			int num = (boxX/o[0]) * (boxY / o[1]) * (boxZ / o[2]);
			max = Math.max(num, max);
		}
		return max;
	}
}

