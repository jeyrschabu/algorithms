package com.jeyrs.algorithms.topcoder.div2;

import java.util.*;


//SRM 146 250
public class YahtzeeScore{
	
	public static void main(String [] args){
		String langs[] = {"english", "french", "italian", 
				"custom-french", "spanish", "russian", "japanese",
				"chinese", "swahili"};
		List<String> res = new ArrayList<String>();

		int limit = 6, currIndex = 5;
		int count = 1;
		for(int i = currIndex; i < langs.length; i++){
			if(count >= limit){
				res.add( "to hear more languages press 7");
				break;
			}
	  		res.add("for");
	  		res.add(langs[i]);
	  		res.add(String.valueOf(count++));
		}
		res.add("to repeat press 8");
		for(String s : res)System.out.println(s);
		int total = count;
		if(count >= limit){
			total++;
		}
		int counter2 = currIndex;
		for(int i= 1; i <= total; i++){
			if(i > limit){
				System.out.println("dtmf ["+i+"] activated for [more] ");
				break;
			}
			if(counter2 < langs.length)
				System.out.println("dtmf ["+i+"] activated for ["+langs[counter2++]+"] ");
		}
		System.out.println("dtmf [8] activated for [repeat]");
	}
	public int maxPoints(int[] toss){
		if(toss.length != 5) return 0;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i : toss){
			if(i < 1 || i >6 ) return 0;
			int count = 1;
			if(m.get(i) != null){
				count = m.get(i) + 1;
			}
			m.put(i, count);
		}
		int max = 0;
		for(Map.Entry<Integer, Integer> me : m.entrySet()){
			int tmp = me.getKey() * me.getValue();
			if(max < tmp) max = tmp;
		}
		return max;
	}
}