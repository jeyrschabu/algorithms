package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;
public class PseudoPrimeTest {
	public int firstFail(int q) {
			for(int i=2; i < q; i++){
				if(modularExponentiation(i, q - 1, q) != 1){
					System.out.println("IM here");
					return i;
				}
			}
			return q;
	}
	int modularExponentiation(int base, int exponent, int mod){
		int res = 1;
		while(exponent > 0){
			if(exponent % 2 == 1) res = (res * base) % mod;  
			exponent = exponent >> 1;
			base = (base * base ) % mod;
		}
		return res;
	}
	int modularExponentiation0(int base, int exponent, int mod) {
	   if (exponent == 0) return 1;
	   if (exponent % 2 == 0) { //exponent is even
	      int temp = modularExponentiation0(base,exponent/2,mod);
	      return (temp * temp) % mod;
	   } else { //exponent is odd
		   return (base * modularExponentiation0(base,exponent-1,mod)) % mod;
	   }
	}
	int ModularExponentiationIter(int base, int exponent, int mod) {
	   int ret = 1;
	   for ( ; exponent > 0 ; exponent /= 2) {
		   if(exponent % 2 == 1) 
			   ret = (ret * base) % mod;
		   base = (base * base) % mod;
	   }
	   return ret;
	}
}
