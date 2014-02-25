package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
public class Bits {
	public int minBits(int n) {
		return Integer.toBinaryString(n).length();
	}
	public int minBits0(int n) {
		return findBinary(n).length();
	}
	String findBinary(int decimal){
		String bin = "";
		int remainder = 0;
		while(decimal != 0){
			remainder = decimal % 2;
			bin = remainder + bin;
			decimal = decimal /2;
		}
		return bin;
	}
}