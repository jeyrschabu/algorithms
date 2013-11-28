package com.jeyrs.algorithms.topcoder.div2;

public class Swimmers{
	public int[] getSwimTimes(int[] distances, int[] speeds, int current){
		int times[] = new int[distances.length];
		for(int i=0; i < distances.length; i++){
			double k = -1;
			if(distances[i] == 0){
				k = 0;
			}else{
				double down = speeds[i] + current;
				double up = speeds[i] - current;
				if(down > 0 && up > 0) {
					k = distances[i]/down + distances[i]/up;
				}
			}
			times[i] = (int)k;
		}
		return times;
	}
}
