package com.jeyrs.algorithms.topcoder.div2;

//SRM 162
public class LCMRange{
	public int lcm(int first, int last){
		int ret = 1;
		for(int i=first; i<= last; i++){
			ret = lcm0(i,ret);
		}
		return ret;
	}
	public int gcd(int x, int y){
		if(x % y == 0)
			return y;
		else if(x > y)
			return gcd(y, x % y);
		else
			return gcd(y, x);
	}
	public int lcm0(int x, int y){
		int gcd = gcd(x, y);
		return (x * y)/gcd;
	}
}
