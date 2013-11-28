package com.jeyrs.algorithms.topcoder;

public class QuizShow {
	public static void main(String [] args){
		QuizShow q = new QuizShow();
		int wager1=75, wager2 = 25;
		int scores [] = new int[]{100, 100, 100};
		
		int bestBet = q.wager(scores, wager1, wager2);
		System.out.println("Best bet => " + bestBet);
		
		wager1=30;
		wager2 = 41;
		scores = new int[]{10, 50, 60};
		
		bestBet = q.wager(scores, wager1, wager2);
		System.out.println("Best bet => " + bestBet);
		
	}
	public int wager(int scores[], int wager1, int wager2){
		int bet, best, odds, wage, i, j, k;
		best = 0; bet = 0;
		
		for(wage = 0; wage <= scores[0]; wage++){
			odds = 0;
			for(i = -1; i <=1 ; i+=2)
				for(j = -1; j <=1 ; j+=2)
					for(k = -1; k <=1 ; k+=2)
						if(scores[0] + i*wage > scores[1] + j*wager1 && scores[0] + i*wage > scores[2] + k*wager2)
							odds++;
			
			if(odds > best){
				bet = wage;
				best = odds;
			}
		}
		return bet;
	}
}
