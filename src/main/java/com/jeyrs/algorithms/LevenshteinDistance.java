package com.jeyrs.algorithms;

public class LevenshteinDistance {
	public static void main(String [] args){
		String s = "kitten";
		String t = "sittin";
		LevenshteinDistance obj = new LevenshteinDistance();
		
		int dist = obj.count(s, t, 0, 0);
		int dist1 = obj.countDP(s, t);
		System.out.println(dist);
		System.out.println(dist1);
	}
	/**
	 * If characters to be compared are equal i.e. s1[m] = s2[n], 
	 * 		then we will compare (m+1)th character of s1 to (n+1)th character of s2 (if both exist).
	 * If we replace one character of string s1 
	 * 		then we will compare (m+1)th character of s1 to (n+1)th character of s2 (if both exist).
	 * If we insert one character to string s1 
	 * 		then we will compare mth character of s1 to (n+1)th character of s2 (if both exist).
	 * If we delete one character from string s1 
	 * 		then we will compare (m+1)th character of s1 to nth character of s2 (if both exist).
	 */
	int count(String s1, String s2, int m, int n){
		if(n == s2.length()) 
			return s1.length() - m;
		if(m == s1.length()) 
			return s2.length() - n; 	
		if(s1.charAt(m) == s2.charAt(n)) 
			return count(s1, s2, m + 1, n + 1);
		if(s1.charAt(m) != s2.charAt(n)){
			return 1 + Math.min(Math.min(count(s1, s2, m, n+1), count(s1, s2, m+1, n)), count(s1, s2, m+1, n+1));	
		}
		return -1;
	}
	void printTable(int table[][]){
		for(int i=0; i <table.length; i++){
			for(int j=0; j < table[i].length; j++)
				System.out.print(table[i][j]);
			System.out.println();
		}
	}
	int countDP(String s1, String s2){
		int m = s1.length();
		int n = s2.length();
		
		int table [][] = new int[m + 1][n + 1];
		
		for(int i = 0; i < m ; i++)
			table[i][0] = i;
		for(int j = 0; j < n; j++)
			table[0][j] = j;
		for(int i = 1; i <= m; i++)
			for(int j = 1; j <=n; j++)
				if(s1.charAt(i - 1)== s2.charAt(j - 1))
					table[i][j] = table[i - 1][j - 1];
				else
					table[i][j] = 1 + Math.min(Math.min(table[i][j -1 ],table[i - 1][j]), table[i - 1][j - 1]);
		
		printTable(table);
		
		return table[m][n];
	}
}
