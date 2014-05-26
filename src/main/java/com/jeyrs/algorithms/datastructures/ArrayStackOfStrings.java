package com.jeyrs.algorithms.datastructures;


public class ArrayStackOfStrings{
	private String[] a;
	private int n;
	
	public ArrayStackOfStrings(int max){
		a = new String[max];
	}
	public boolean isEmpty(){
		return n == 0;
	}
	public void push(String s){
		a[n++] = s;
	}
	public String pop(){
		return a[n--];
	}
}
