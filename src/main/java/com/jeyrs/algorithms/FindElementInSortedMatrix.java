package com.jeyrs.algorithms;

public class FindElementInSortedMatrix {
	public static void main(String [] args){	
		int[][] matrix = {
				  { 1, 2, 3 },
				  { 4, 5, 6 },
				  { 7, 8, 9 }
				};
		for(int row = 0; row < matrix[0].length; row++){
			for(int col = 0; col < matrix[0].length; col++){
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println(findElementInSortedMatrix(matrix, 4));
	}
	public static boolean findElementInSortedMatrix(int [][] matrix, int n){
		int row = 0;
		int col = matrix[0].length - 1;
		
		while(row < matrix.length && col >=0){
			System.out.println("Looking at " + matrix[row][col]);
			if(matrix[row][col] == n)
				return true;
			else if(matrix[row][col] > n)
				col--;
			else
				row++;
		}		
		return false;
	}
}
