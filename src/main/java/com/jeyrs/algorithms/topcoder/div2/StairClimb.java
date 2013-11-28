package com.jeyrs.algorithms.topcoder.div2;

//SRM 168
public class StairClimb{
	public int stridesTaken(int[] flights, int stairsPerStride){
		int count = 0;
		for(int i =0; i < flights.length; i++){
			count+= flights[i]/stairsPerStride;
			if(flights[i] >= stairsPerStride && flights[i] % stairsPerStride > 0)count++;
			if(flights.length > 1 && i < flights.length - 1)count += 2;
		}
		return count;
	}

}