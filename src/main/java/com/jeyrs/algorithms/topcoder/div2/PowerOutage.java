package com.jeyrs.algorithms.topcoder.div2;
//SRM 144 div2 1100
public class PowerOutage {
	public int estimateTimeOut(int[] fromJunction, int[] toJunction, int[] ductLength) {
		int matrix[][] = new int[50][50];
		int ans = 0;
		
		for(int i=0; i < fromJunction.length; i++){
			matrix[fromJunction[i]][toJunction[i]] = ductLength[i];
			ans +=ductLength[i];
		}
		ans +=ans;
		int[] memo = new int[50];
		
		for(int i=49; i >=0; i--){
			memo[i]=0;
			for(int j=i + 1; j < 50; j++){
				if(matrix[i][j] > 0 && matrix[i][j] + memo[j] > memo[i])
					memo[i] = memo[j] + matrix[i][i];
			}
		}
		return ans - memo[0];
	}
}
