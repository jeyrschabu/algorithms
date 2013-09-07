package com.jeyrs.algorithms;
import java.math.*;
public class Lottery{
	private BigInteger nCk(int n, int k){
		if(n >= k)
			return factorial(n).divide(factorial(n - k).multiply(factorial(k)));
		return BigInteger.ZERO;
	}
	public BigInteger factorial(int n){
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) {
        	ret = ret.multiply(BigInteger.valueOf(i));
        }
        return ret;
	}
	private int possibilities(int n, int k, boolean uniq, boolean sorted){
		int total = 1;
		int eliminated = 0;
		for(int i = 0; i < k; i++)
			total *=n;
		if(sorted)
			eliminated +=nCk(n, k).intValue();
		if(uniq)
			eliminated +=nCk(n, 1).intValue();
		return total - eliminated;			
	}
	public String[] sortByOdds(String[] rules){
		String [] sortedByOdds = null;
		String [] tmp = new String[rules.length];
		int limit = 10000000;
		int counter = 0;
		for(String str : rules){
			String[] nameAndRules =  str.split(": ");
			String name = nameAndRules[0];
			String rulePart[] = nameAndRules[1].split(" ");
			int n = Integer.parseInt(rulePart[0]),k = Integer.parseInt(rulePart[1]);
			boolean uniq = false, sorted = false;
			if(rulePart[2].equals("T"))
				sorted = true;
			if(rulePart[3].equals("T"))
				uniq = true;
			int p = possibilities(n, k, uniq, sorted);
			
			
			name = name+"="+p;
			tmp[counter] = name;
			counter++;
		}
		int max = 0;
		for(String str : tmp){//find max
			String a[] = str.split("=");
			int i = Integer.parseInt(a[1]);
			if(max < i)max = i;
		}
		sortedByOdds = new String[max + 1];
		for(String str : tmp){
			String a[] = str.split("=");
			String name = a[0];
			int i = Integer.parseInt(a[1]);
			sortedByOdds[i] = name;
		}
		String [] ret = new String[tmp.length];
		int j=0;
		for(int i=0; i < sortedByOdds.length; i++){
			if(null == sortedByOdds[i] || sortedByOdds[i].equals(""))
				continue;
			if(null != ret[j] && !"".equals(ret[j])){
				if(ret[j].compareTo(sortedByOdds[i]) < 1){
					String t = ret[j];
					ret[j] = sortedByOdds[i];
					ret[j + 1] = t;
				}
			}else{
				ret[j] = sortedByOdds[i];
			}
			j++;
		}
		return ret;
	}
}
