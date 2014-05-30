package com.jeyrs.algorithms.sorting;

public class QuickSort {
	
	
	public static void main(String [] args){
		int [] numbers = new int[]{31, 41, 59, 26, 41, 58};
		for(int i : numbers)
			System.out.print(i+" ");
		System.out.println();
		QuickSort s = new QuickSort();
		s.quickSort(numbers, 0, numbers.length - 1);
		
		for(int i : numbers)
			System.out.print(i+" ");
		
		System.out.println();
	}
	
	public void quickSort(int[] numbers, int low, int high){
		if(high - low > 0){
			int pivot = partition(numbers, low, high);
			quickSort(numbers, low, pivot - 1);
			quickSort(numbers, pivot + 1, high);
		}
	}
	private int partition(int numbers[], int low, int high) {
		int p = high;
		int firsthigh = low;
		
		for(int i = low; i < high; i++){
			if(numbers[i] < numbers[p]){
				swap(numbers, i, firsthigh);
				firsthigh++;
			}
		}
		swap(numbers, p, firsthigh);
		return firsthigh;
	}
	private void swap(int[] numbers, int i, int j) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}
}
