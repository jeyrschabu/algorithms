package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
//SRM 187
public class OfficeParking {
	public int spacesUsed(String[] events) {
		int ans = 0;
		Set<String> set = new HashSet<String>();
		for(String x : events){
			String key = x.split(" ")[0];
			if(set.contains(key))
				set.remove(key);
			else set.add(key);
			ans = Math.max(ans, set.size());
		}
		return ans;
	}
	public int spacesUsed0(String[] events) {
		int max =0, c=0;
		for(int i=0; i < events.length; i++){
			if(events[i].endsWith("arrives")) c++;
			else c--;
			max = Math.max(c, max);
		}
		return max;
	}
}
