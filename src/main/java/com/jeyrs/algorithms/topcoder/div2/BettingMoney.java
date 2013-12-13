package com.jeyrs.algorithms.topcoder.div2;

//SRM 191
import java.util.*;
public class BettingMoney {
	public int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult) {
		int net = 0;
		for(int i=0; i < amounts.length; i++)
			if(i != finalResult)net +=amounts[i];
		return net * 100 - amounts[finalResult] * centsPerDollar[finalResult];
	}
	public int moneyMade0(int[] amounts, int[] centsPerDollar, int finalResult) {
		
		int netGain = 0;
		for(int i = 0; i < amounts.length; i++){
			if(i == finalResult)
				netGain -= amounts[i] * centsPerDollar[i];
			else
				netGain += amounts[i] * 100;
		}
		return netGain;
	}
}
