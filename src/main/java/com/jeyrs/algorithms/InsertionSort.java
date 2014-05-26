package com.jeyrs.algorithms;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String [] args){
		int [] numbers = new int[]{31, 41, 59, 26, 41, 58};
		for(int i : numbers)
			System.out.print(i+" ");
		System.out.println();
		InsertionSort s = new InsertionSort();
		s.insertionSort(numbers);
		
		for(int i : numbers)
			System.out.print(i+" ");
		
		System.out.println();
		
	}
	public void insertionSort(int [] numbers){
		for(int i = 1; i < numbers.length; i++){
			int val = numbers[i];
			int j = i - 1;
			while(j >= 0 && numbers[j] > val){
				numbers[j + 1] = numbers[j];
				j--;
			}
			numbers[j + 1] = val;
		}
		
	}
}
