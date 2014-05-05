package com.jeyrs.algorithms.topcoder.div2.srm144;

//200
public class Time {
	public String whatTime(int seconds) {
		int h =0, m =0, s =0;
		if(seconds == 0) return "0:0:0";
		else{
			h = seconds/ 3600;
			int r = (seconds % 3600);
			m =  r/60;
			s = r % 60;		
		}
		return h+":"+m+":"+s;
	}
}
