package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
//SRM 204
public class Medici {
	public int winner(int[] fame, int[] fortune, int[] secrets) {
		int largestWeak = 0;
		int winner = 0;
		for(int player = 0; player < fame.length; player++){
			int fa = fame[player];
			int fo = fortune[player];
			int s = secrets[player];
			int weakest = Math.min(fa, Math.min(fo, s));
			if(weakest > largestWeak){
				largestWeak = weakest;
				winner = player;
			}else if(weakest == largestWeak){
				winner = -1;
			}
		}
		return winner;
	}
}
