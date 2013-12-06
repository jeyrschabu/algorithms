package com.jeyrs.algorithms.topcoder.div2;

public class DinkyFish{
	public int monthsUntilCrowded(int tankVolume, int maleNum, int femaleNum){
		int months = 0;
		int max = tankVolume*2;
		int num = maleNum + femaleNum;
		int couples = Math.min(maleNum, femaleNum);
		
		while(num <= max){
			months++;
			num +=couples * 2;
			couples = couples * 2;
		}
		return months;
	}
}
