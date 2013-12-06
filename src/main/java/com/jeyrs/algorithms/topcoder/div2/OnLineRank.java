package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
public class OnLineRank {
	public static void main(String[] args) {
		OnLineRank temp = new OnLineRank();
		int k = 3;
		int scores [] = new int[]{6,9,8,15,7,12};
		System.out.println(temp.calcRanks(k, scores));
		System.out.println(temp.calcRanks0(k, scores));
		
		
		
	}
	public int calcRanks(int k, int[] scores) {
		int ans = 0;
		for(int i = 0; i < scores.length; i++){
			int score = 1;
			for(int j = Math.max(0, i - k); j < i ;  j++){
				
				if( scores[j] > scores[i]){
					++score;	
				}
			}
			ans +=score;
		}
		return ans;
	}
	public int calcRanks0(int k, int[] scores) {
		int ans = scores.length;
		for(int i = 0; i < scores.length; i++)
			for(int j = 1; j <= k; j++)
				if(i - j >= 0 && scores[i - j] > scores[i])
					ans++;
		return ans;
	}
}
