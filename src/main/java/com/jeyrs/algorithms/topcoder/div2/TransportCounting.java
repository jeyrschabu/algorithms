package com.jeyrs.algorithms.topcoder.div2;

//SRM 207
public class TransportCounting {
	public int countBuses(int speed, int[] positions, int[] velocities, int time){
		int ret = 0;
		for(int i = 0; i < positions.length; i++)
			if(positions[i] == 0 || positions[i] + velocities[i] * time < speed * time)
				ret++;
		return ret;
	}
}
