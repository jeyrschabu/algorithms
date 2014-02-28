package com.jeyrs.algorithms.topcoder.div2;

//SRM 145 500
public class ExerciseMachine {
	public int getPercentages(String time){
		String [] z = time.split(":");
		int t = Integer.parseInt(z[0]) * 3600 + Integer.parseInt(z[1]) * 60 + Integer.parseInt(z[2]);
		int ans = 0;
		for(int i=1; i <= 99; i++){
			if(t * i % 100 == 0){
				ans++;
			}
		}
		return ans;
	}
}
