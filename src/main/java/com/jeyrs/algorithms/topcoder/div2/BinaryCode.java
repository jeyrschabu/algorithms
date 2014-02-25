package com.jeyrs.algorithms.topcoder.div2;

//SRM 144 div2 550
public class BinaryCode {
	public String [] decode(String message){
		int a[] = new int[message.length()];
		for(int i = 0; i < message.length(); i++){
			a[i] = message.charAt(i) - '0';
		}
		return new String[]{resultAt(a, 0), resultAt(a, 1)};
	}
	private String resultAt(int[] a, int i) {
		int res[] = new int[a.length];
		res[0] = i;
		
		if(a.length > 1){
			res[1] = a[0] - res[0];
		}
		for(int j=2; j < a.length; j++){
			res[i] = a[i - 1] - res[i - 1] - res[i - 2];
		}
		if(a.length > 1 && res[a.length - 1] + res[a.length - 2] != a[a.length - 1] ) 
			return "NONE";
		if(a.length == 1&& a[0] != res[0])
			return "NONE";
		String ret = "";
		for(int j =0; j < a.length; j++){
			if(res[i] < 0 || res[i] > 1){
				return "NONE";
			}else{
				ret +=res[i];
			}
		}
		return ret;
	}
}
