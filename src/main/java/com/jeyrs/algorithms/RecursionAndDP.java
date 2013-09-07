package com.jeyrs.algorithms;

public class RecursionAndDP {
	public static void main(String [] args){
		//moves(3, true);
		int n [] = new int[]{4, 2, 2, 8};
		//System.out.println(groupSum(0, n, 10));
		//2, 5, 10, 4}, 12
		altArray(n);
		for(int i : n){
			System.out.println(i);
		}
		//System.out.println(groupSumClump(0, n, 14));
	}
    public static void moves(int n, boolean left) {
        if (n == 0) return;
        moves(n-1, !left);
        if (left) System.out.println(n + " left");
        else      System.out.println(n + " right");
        moves(n-1, !left);
    }
    public static boolean groupSum(int start, int[] nums, int target) {
    	  if (start == nums.length) 
    			return (target == 0);
    	  if (groupSum(start + 1, nums, target - nums[start])) 
    			return true;
    	  if (groupSum(start + 1, nums, target)) 
    			return true;
    	  return false;
    }
    public static boolean groupSum6(int start, int[] nums, int target){
    	if(start == nums.length)
    		return target == 0;
    	if(groupSum6(start + 1, nums, target - nums[start]))return true;
    	if(nums[start] != 6 && groupSum6(start + 1, nums, target))return true;
    	return false;
    }
    public static boolean groupNoAdj(int start, int[] nums, int target){
    	if(start >= nums.length)
    		return target == 0;
    	if(groupNoAdj(start + 2, nums, target - nums[start])) return true;
    	if(groupNoAdj(start + 1, nums, target)) return true;
    	
    	return false;
    }
    public static boolean groupSum5(int start, int[]nums, int target){
    	if(start >= nums.length)
    		return target == 0;
    	if(nums[start] % 5 ==0){
    		if(start < nums.length - 1 && nums[start + 1] == 1 )
    			return (groupSum5(start + 2, nums, target - nums[start]));
    		return (groupSum5(start + 1, nums, target - nums[start]));
    	}
    	if(groupSum5(start + 1, nums, target - nums[start]))return true;
    	if(groupSum5(start + 1, nums, target))return true;
    	return false;
    }
    public static boolean groupSumClump(int start, int[]nums, int target){
    	if(start >= nums.length)
    		return target == 0;
    	altArray(nums);
    	if(groupSumClump(start + 1, nums, target - nums[start]))return true;
    	if(groupSumClump(start + 1, nums, target))return true;
    	return false;
    }
    public static void SelectionSort ( int [ ] arr ){
    	int min;
        for (int i = 0; i < arr.length; i++) {
            // Assume first element is min
            min = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i){
                final int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    public static void altArray(int[] nums){
	  for (int i = 0; i < nums.length; i++){
	    if (i > 0 && nums[i] == nums[i-1]){
	      nums[i-1] += nums[i];
	      if (i+1 < nums.length && nums[i] != nums[i+1])
	        nums[i] = 0;
	      else if (i == nums.length-1)
	        nums[i] = 0;
	    }
	 }
    }
}
