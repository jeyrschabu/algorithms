package com.jeyrs.algorithms.topcoder.div2.srm148;

import java.util.*;
public class CeyKaps {
	public String decipher(String typed, String[] switches) {
        String ans = "";
		for(int i = 0; i < typed.length(); i++){
            char current = typed.charAt(i);
            for(int j = 0; j < switches.length; j++){
                if(switches[j].charAt(0) == current){
                    current = switches[j].charAt(2);
                }else if(switches[j].charAt(2) == current){
                    current = switches[j].charAt(0);
                }
                
            }
            ans +=current;
        }
        return ans;
            
	}
}