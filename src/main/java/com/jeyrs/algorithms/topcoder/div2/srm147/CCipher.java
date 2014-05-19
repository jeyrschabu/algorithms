package com.jeyrs.algorithms.topcoder.div2.srm147;

import java.util.*;
//SRM 147 250
public class CCipher {
	public static void main(String args[]){
		String str = "ABCD";
		int t = str.charAt(1) - 'A';
		char a = (char)(t + 'A');
		System.out.println(t);
		System.out.println(a);
		String [] langs = new String[]{"FG_1", "FG_0", "Fadf", "English", "Tai"};
		
		System.out.println(Arrays.deepToString(langs));
		
		Arrays.sort(langs);
		
		System.out.println(Arrays.deepToString(langs));
		
		System.out.println(Arrays.deepToString(langs));
		
		System.out.println(Arrays.deepToString(langs));
		
	}
	public String decode(String cipherText, int shift) {
		char[] letters = cipherText.toCharArray();
		for(int i =0; i < cipherText.length(); i++)
			letters[i] = (char) (((letters[i] - 'A' + 26 -shift)%26) + 'A');
		return new String(letters);
	}
}
