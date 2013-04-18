package com.jeyrs.algorithms;

public class StringsManipulation{
	public static void main(String [] args){
		
	}
	public boolean hasUniqueChars(String str){
		boolean [] charSet = new boolean [256];
		
		for(int i = 0; i < str.length(); i++){
			int val = str.charAt(i);			
			if(charSet[val])
				return false;
			charSet[val] = true;
			
		}		
		return true;
	}
	//using a bit vector
	public static boolean hasUniqueChars2(String str){
		int checker = 0;
		for(int i = 0; i < str.length(); i++){
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}								
		return true;
	}
}
