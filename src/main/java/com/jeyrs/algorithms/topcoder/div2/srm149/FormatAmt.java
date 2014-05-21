package com.jeyrs.algorithms.topcoder.div2.srm149;

//SRM 149 200
import java.util.*;
public class FormatAmt {
	public String amount(int dollars, int cents) {
	 String a = dollars+"";
     int counter = 0;
     String ret="";
     for(int i =a.length() -  1; i>=0; i--){
         if(counter % 3 == 0 && i < a.length() - 1)
             ret = ","+ret;
         ret = a.charAt(i) + ret;
         counter++;
     }
     if(cents < 10)
         ret = "$"+ret+".0"+cents;
     else ret = "$"+ret+"."+cents;
     return ret;
	}
}
