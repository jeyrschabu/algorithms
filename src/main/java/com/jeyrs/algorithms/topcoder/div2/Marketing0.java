package com.jeyrs.algorithms.topcoder.div2;

import java.util.ArrayList;
import java.util.List;

public class Marketing0 {
	public static void main(String args[]){
		String compete[] = {"1 4", "2", "3", "0", ""};
		long res = new Marketing0().howMany(compete);
		
		String next = "\"#floodgate_menu\"";
		String vxml = "<form><block><goto next="+next+"/></block></form>";
		System.out.println(vxml);
	}
	public long howMany(String[] compete){
		int[]mark = new int[compete.length];
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		int count = 0;
		
		for(int i = 0; i < compete.length; i++){
			input.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i < compete.length; i++){
			if(compete[i].length() != 0){
				for(String ss : compete[i].split("[ ]")){
					int j = Integer.parseInt(ss);
					input.get(i).add(j);
					input.get(j).add(i);
				}
			}
		}
		System.out.println(input);
		return 1 << count;
	}
}
