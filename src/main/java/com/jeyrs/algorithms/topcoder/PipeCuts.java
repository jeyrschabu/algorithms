package com.jeyrs.algorithms.topcoder;

import java.util.Arrays;

public class PipeCuts {
	public static void main(String[] args){
		int weldLocations [] = new int[]{25, 50, 75};
		int L = 25;
		
		System.out.println(new PipeCuts().probability(weldLocations, L));
	}
	double probability(int weldLocations[], int L){
		int count = 0;
		Arrays.sort(weldLocations);
		
		for(int i=0; i < weldLocations.length; ++i){
			for(int j=i+1; j <weldLocations.length; ++j){
				int left = weldLocations[i];
				int center = weldLocations[j] - left;
				int right = 100 - weldLocations[j];
				
				if(left > L || right > L || center > L)
					count++;
			}
		}
		int total = weldLocations.length * (weldLocations.length - 1)/2;
		return 1.0*count/total;
	}
}
