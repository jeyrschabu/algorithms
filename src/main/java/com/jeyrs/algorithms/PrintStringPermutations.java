package com.jeyrs.algorithms;

public class PrintStringPermutations {
	public static void main(String [] args){
		printStringPermutations("","abc");
	}
	public static void printStringPermutations(String prefix, String str){
		if(str.length() == 0) System.out.println(prefix);
		else{
			for(int i=0; i <str.length(); i++)
				printStringPermutations(prefix+str.charAt(i), str.substring(0, i) + str.substring(i+1));
		}
	}
}
