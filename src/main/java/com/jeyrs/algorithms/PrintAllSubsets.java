package com.jeyrs.algorithms;

public class PrintAllSubsets {
	public static void main(String [] args){
		printAllSubsets(new int[]{1,2,3});	
	}
	public static void printAllSubsets(int [] numbers){ 
		int n = numbers.length;
		int np = 1<<n;
		for (int i=1; i<np; i++){
			int bitv = i;
			int pos = 0;
			while (bitv > 0){
				if ((bitv & 1) == 1) 
					System.out.print(numbers[pos] + " ");
				bitv >>= 1;
				pos++;
			}
			System.out.println();
		}
	}
}
