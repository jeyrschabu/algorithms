package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;

//SRM 177
public class Stairs {
	public int designs(int maxHeight, int minWidth, int totalHeight, int totalWidth) {		
		List<Integer> risers = new ArrayList<Integer>();
		//legal rises
		for(int i=1; i <= totalHeight; i++){
			if(totalHeight % i == 0 && i <= maxHeight){
				risers.add(i);
			}
		}
		//legal treads
		List<Integer> treads = new ArrayList<Integer>();
		for(int i=1; i <= totalWidth; i++){
			if(totalWidth % i == 0 && i >= minWidth){
				treads.add(i);
			}
		}
		int count = 0;
		
		for(int tread : treads){
			int total = totalWidth / tread; //total number of allowed treads
			int total2 = total + 1;
			
			for(int riser : risers ){
				if(riser * total2 == totalHeight) count++;
			}
		}
		return count;
	}
	//better approach
	public int designs0(int maxHeight, int minWidth, int totalHeight, int totalWidth){
		
		int ans = 0;
		for(int i=1; i <= maxHeight; i++ )
			for(int j = minWidth; j <= totalWidth; j++)
				if(totalHeight % i == 0 && totalWidth % j == 0 && totalHeight/i -1 == totalWidth /j) ans++;
		return ans;
	}
}

