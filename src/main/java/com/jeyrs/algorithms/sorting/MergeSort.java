package com.jeyrs.algorithms.sorting;

import java.util.LinkedList;
import java.util.Queue;

public class MergeSort {

	public static void main(String [] args){
		int [] numbers = new int[]{31, 41, 59, 26, 41, 58};
		for(int i : numbers)
			System.out.print(i+" ");
		System.out.println();
		MergeSort s = new MergeSort();
		s.mergesort(numbers, 0, numbers.length - 1);
		
		for(int i : numbers)
			System.out.print(i+" ");
		
		System.out.println();
	}	
	
	public void mergesort(int [] numbers, int low, int high){
		if(low < high){
			int middle = (low + high)/2;
			mergesort(numbers, low, middle);
			mergesort(numbers, middle + 1, high);
			merge(numbers, low, middle, high);
		}
	}
	private void merge(int [] numbers, int low, int middle, int high) {
		int [] helper = new int[numbers.length];
		
	    // Copy both parts into the helper array
	    for (int i = low; i <= high; i++) {
	      helper[i] = numbers[i];
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    // Copy the smallest values from either the left or the right side back
	    // to the original array
	    while (i <= middle && j <= high) {
	      if (helper[i] <= helper[j]) {
	        numbers[k] = helper[i];
	        i++;
	      } else {
	        numbers[k] = helper[j];
	        j++;
	      }
	      k++;
	    }
	    // Copy the rest of the left side of the array into the target array
	    while (i <= middle) {
	      numbers[k] = helper[i];
	      k++;
	      i++;
	    }

	  }
}
