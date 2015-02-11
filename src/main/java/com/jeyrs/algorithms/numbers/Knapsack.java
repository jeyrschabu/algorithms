package com.jeyrs.algorithms.numbers;


public class Knapsack {
	
	public static void main(String args[]){
		int values[] = new int[]{0, 2, 100, 3};
		int weights[] = new int[]{3, 100, 100, 100};
		
		int n = 4;
		Knapsack tmp = new Knapsack();
		int res = tmp.doKnapsack(values, weights, n, values.length);
		
		System.out.println(res);
	}
	public int doKnapsack(int values[], int weights[], int n, int capacity){
		int m[][] = new int[100][100];
		
		for(int i = 0; i < values.length; i++)
			m[0][i] = 0;
		
		for(int i = 1; i <= n; i++){
			for(int j = 0; j <= capacity; j++){
				if(weights[i - 	1] <= j){
					m[i][j] = Math.max(m[i-1][j],values[i-1]+m[i-1][j-weights[i-1]]);
				}else{
					m[i][j] = m[i - 1][j];
				}
			}
		}
		
		return m[n][capacity];
		
	}
}
