package com.jeyrs.algorithms.topcoder.div2.srm150;
import java.util.*;

//200
public class WidgetRepairs {
	public int days(int[] arrivals, int numPerDay) {
		int workdays = 0;
        int remaining = 0;
        
        for(int i = 0 ; i < arrivals.length; i++){
            int today = arrivals[i] + remaining;
            remaining = Math.max(0, today - numPerDay);
            if(today > 0) workdays++;
        }
        if(remaining > 0){
           
            if(remaining % numPerDay > 0){
                workdays += remaining/numPerDay + 1;
            }else{
                workdays += remaining/numPerDay;
            }

        }
        
        return workdays;
	}
}