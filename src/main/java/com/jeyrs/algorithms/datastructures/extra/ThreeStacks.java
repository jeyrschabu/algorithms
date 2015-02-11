package com.jeyrs.algorithms.datastructures.extra;

public class ThreeStacks {
	int top[];
	int s[];
	int stackSize;
	
	public ThreeStacks(int stackSize){
		top = new int[]{-1, -1, -1};
		s = new int[stackSize * 3];
		this.stackSize = stackSize;
	}
	boolean isEmpty(int k){
		return top[k] < 0;
	}
	void push(int k, int data){
		if(top[k] + 1 >= stackSize) return; //overflow
		top[k]++;
		s[top[k]] = data;
	}
	public static void main(String[] args){
		ThreeStacks stacks = new ThreeStacks(10);
		stacks.push(0, 1);
		stacks.push(1, 1);
		stacks.push(2, 8);
		System.out.println(stacks);
	}
	
	public String toString(){
		String ret = "";
		int max = top[0];
		for(int i = 1; i < top.length; i++){
			max = Math.max(max, top[i]);
		}
		System.out.println(max);
		for(int i = 0; i <= max; i++){
			ret += s[i]+" ->";
		}
		
		
	
		return ret;
	}
	
	
}
