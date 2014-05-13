package com.jeyrs.algorithms.topcoder.div2.srm144;

//500 --borrowed from code review
public class BinaryCode {
	public String[] decode(String message) {
		int n = message.length();
		int [] v = new int[n];
		for(int i=0; i < n; i++)v[i] = message.charAt(i) - '0';
		
		return new String[]{decode(v, 0), decode(v, 1)};
	}
	private String decode(int v[], int start){
		int n = v.length;
		int [] ans = new int[n];
		ans[0] = start;
		if(n > 1) ans[1] = v[0] - ans[0];
		
		for(int i = 2; i < n; i++)
			ans[i] = v[i - 1] - ans[i -1] - ans[i - 2];
		
		if(n > 1 && ans[n - 1] + ans[n -2] != v[n - 1])
			return "NONE";
		if(n == 1 && v[0] != ans[0])
			return "NONE";
		String ret = "";
		for(int i =0; i < n; i++){
			if(ans[i] < 0 || ans[i] > 1)
				return "NONE";
			else ret += ans[i];
		}
		return ret;
	}
}
