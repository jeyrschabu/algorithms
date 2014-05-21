package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;

//SRM 182
public class IBEvaluator {
	public int[] getSummary(int[] predictedGrades, int[] actualGrades){
		int total = predictedGrades.length;
		int res[] = new int[7];
		
		for(int i=0; i < total; i++){
			predictedGrades[i] = Math.abs(predictedGrades[i] - actualGrades[i]);
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < total; i++){
			if(map.get(predictedGrades[i]) != null){
				map.put(predictedGrades[i], map.get(predictedGrades[i]) + 1);
			}else{
				map.put(predictedGrades[i], 1);
			}

		}
		for(int i = 0; i < 7; i++){
			Integer count = map.get(i);
			if(null == count)count = 0;
			double percent = Math.floor(count * 100/total);
			res[i] = (int) percent;
		}
		return res;
	}
	public int[] getSummary1(int[] predictedGrades, int[] actualGrades){
		int [] total = new int[7];
		for(int i = 0; i < predictedGrades.length; i++){
			int diff = Math.abs(predictedGrades[i] - actualGrades[i]);
			total[diff]++;
		}
		for(int i=0; i < total.length; i++){
			total[i] = (int)(total[i] * 100.0/predictedGrades.length);
		}
		return total;
		
	}
	//using binary search
	public int[] getSummary0(int[] predictedGrades, int[] actualGrades){
		int total = predictedGrades.length;
		int res[] = new int[7];
		
		for(int i=0; i < total; i++){
			predictedGrades[i] = Math.abs(predictedGrades[i] - actualGrades[i]);
		}
		Arrays.sort(predictedGrades);
		for(int i = 0; i < 7; i++){
			int count = countNumberFrequency(i, predictedGrades, 0, total - 1);
		
			double percent = Math.floor(count * 100/total);
			res[i] = (int) percent;
		}
		return res;
	}
	
	//use bynary search, potentially O(nlgn)
	public int countNumberFrequency(int n, int [] x, int start, int end){
		if(end < start)return 0;
		if(x[start] > n) return 0;
		if(x[end] < n) return 0;
		
		if(x[start] == n && x[end] == n) return end - start + 1; //means all items are the same
		int mid = (start + end)/2;
		if(x[mid] == n)
			return 1 + countNumberFrequency(n, x, start, mid-1) + countNumberFrequency(n, x, mid+1, end);
		else if(x[mid] > n)
			return countNumberFrequency(n, x, start, mid -1);
		else
			return countNumberFrequency(n, x, mid+1, end);
	}
}
