package com.jeyrs.algorithms.topcoder.div2;

//SRM 190
import java.util.*;
public class ScoringEfficiency {
	public double getPointsPerShot(String[] gameLog){
		double totalPoints = 0, fgAttempted = 0, ftAttempted = 0;
		for(String g : gameLog){
			String a[] = g.split(" ");
			if(a[0].equals("Made")){
				if(a[1].equals("free")){
					totalPoints++;
					ftAttempted++;
				}else{
					totalPoints += Double.parseDouble(a[1]);
					fgAttempted++;
				}
			}else{
				if(a[1].equals("free")){
					ftAttempted++;
				}else{
					fgAttempted++;
				}
			}
		}
		double pps = totalPoints/(fgAttempted + 0.5 * ftAttempted);
		return pps;
	}
}
