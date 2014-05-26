package com.jeyrs.algorithms.sorting;

public class SortAndSearch{
	public static void main(String [] args){
		int a[] = new int[]{2,4,5,8,12,0, 0, 0, 0, 0}, b[] = new int[]{3,6,9,11};
		merge(a,b,5,4);
		for(int i : a)
			System.out.println(i);
		
		System.out.println(anagram("yes","esy"));
		
		
		
		
	}
	public static void merge(int a[], int b[], int n, int m){
		int i = n - 1;
		int j = m - 1;
		int k = n + m - 1;
		
		while(i >=0 && j > 0)
			if(a[i] > b[j])
				a[k--] = a[i--];
			else
				a[k--] = b[j--];
		while(j >=0)
			a[k--] = b[j--];
	}
	public static boolean anagram(String a, String b){
		int v = 0, v2=0;//bit vectors
		if(a.length() != b.length()) return false;
		
		for(int i = 0; i < a.length() ; i++)
			v |= (1 << (a.charAt(i) - 'a'));
		for(int i = 0; i < b.length(); i++)
			v2 |= (1 << (b.charAt(i) - 'a'));
		
		return v == v2;
	}
}
