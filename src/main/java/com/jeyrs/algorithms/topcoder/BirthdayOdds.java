package com.jeyrs.algorithms.topcoder;

public class BirthdayOdds {
	public static void main(String [] args){
		int minOdds = 75, days = 5;
		int result = new BirthdayOdds().minPeople(minOdds, days);
		System.out.println("The result is " + result);
	}
	public int minPeople(int minOdds, int days){
		int nr;
		double target, p;
		
		target = 1 - (double) minOdds/ 100;
		
		nr = 1;
		p = 1;
		
		while(p > target){
			p = p * ((double)1 - (double) nr/days);
			nr++;
		}
		return nr;
	}
}
