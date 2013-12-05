package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
//SRM #178
public class SimpleCalculator {
	public int calculate(String input) {
		String a[] = input.split("\\W");
		
		System.out.println(Arrays.toString(a));
		String op = "";
		List<String> ops = new ArrayList<String>();
		ops.add("+");
		ops.add("-");
		ops.add("*");
		ops.add("/");
		
		for(int i = 0; i < input.length(); i++){
			if(ops.contains(input.charAt(i)+"")){
				op = input.charAt(i)+"";
				break;
			}
		}
		
		if(op.equals("+")){
			return Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
		}else if(op.equals("/")){
			return Integer.parseInt(a[0]) / Integer.parseInt(a[1]);
		}else if(op.equals("*")){
			return Integer.parseInt(a[0]) * Integer.parseInt(a[1]);
		}
		return Integer.parseInt(a[0]) - Integer.parseInt(a[1]);
	}
}
