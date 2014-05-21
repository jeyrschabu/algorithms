package com.jeyrs.algorithms.topcoder.div2;

public class CrossWord {
	public int countWords(String[] board, int size) {
		int ans = 0;
		for(int row= 0; row < board.length; row++){
			String s = board[row];
			int dots = 0;
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) == '.')dots++;
				else{
					if(dots == size)ans++;
					dots = 0;
				}				
			}
			if(dots > 0 && size == dots)ans++;
		}
		return ans;
	}
}
