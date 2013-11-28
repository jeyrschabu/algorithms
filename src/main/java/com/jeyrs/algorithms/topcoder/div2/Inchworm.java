package com.jeyrs.algorithms.topcoder.div2;

//SRM 163
public class Inchworm{
	public int lunchtime(int branch, int rest, int leaf){
		int count = 0;
		for(int i=0;i<= branch; i+=leaf){
			for(int j=0; j <= branch; j+=rest ){
				if(i==j)count++;
			}
		}
		return count;
	}
	//mathematical way
	public int lunchtime0(int branch, int rest, int leaf){
		return branch/lcm(rest, leaf) + 1;
	}
	//another way using mod
	public int lunchtime1(int branch, int rest, int leaf){
		int count = 0;
		for(int j=0; j <= branch; j+=rest)
			if(j%leaf == 0)count++;
		return count;
	}
	public int gcd(int x, int y){
		if(x % y == 0)
			return y;
		else if(x > y)
			return gcd(y, x % y);
		else
			return gcd(y, x);
	}
	public int lcm(int x, int y){
		int gcd = gcd(x, y);
		return (x * y)/gcd;
	}
}