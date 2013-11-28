package com.jeyrs.algorithms.topcoder;

import java.util.List;
import java.util.ArrayList;
public class CCipher{
	public static void main(String[] main){
		CCipher c = new CCipher();
		int shift = 25;
		String cipherText = "ZWBGLZ";
		String r = c.decode(cipherText, shift);
		System.out.println(r);
		r = c.decode0(cipherText, shift);
		System.out.println(r);
		
		
	}
	public String decode(String cipherText, int shift){
		List<String> alphabet = new ArrayList<String>();	
		for(int i = 0; i < 26; i++)
			alphabet.add(i, String.valueOf((char)((i + 1) + 'A' - 1)));
		
		String ret = "";
		int total = alphabet.size();
		for(char c : cipherText.toCharArray()){
			int j = (total + alphabet.indexOf(String.valueOf(c)) - shift) % total;
			ret +=alphabet.get(j);
		}
		return ret;
	}
	public String decode0(String cipherText, int shift){
		String result = "";
		for(int i=0; i < cipherText.length(); i++)
			result += (char)((cipherText.charAt(i) - 'A' - shift + 26) % 26 + 'A');
		return result;
	}
}
