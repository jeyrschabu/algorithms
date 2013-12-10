package com.jeyrs.algorithms.topcoder.div2;

//SRM 185
import java.util.*;
public class PassingGrade {
	public int pointsNeeded(int[] pointsEarned, int[] pointsPossible, int finalExam) {
		double passing = 0;
		int score = 0, total = 0;
		for(int i = 0; i < pointsPossible.length; i++){
			total +=pointsPossible[i];
		}
		total +=finalExam;
		for(int i = 0; i < pointsEarned.length; i++){
			score +=pointsEarned[i];
		}
		passing = score * 100/total;
		int last = 0;
		if(passing >= 65) return 0;
		for(int i = 0; i < finalExam; i++){
			passing = (score + last) * 100/total;
			if(passing >= 65) return last;
			last++;
		}
		
		if(passing <= 65) return -1;
		return last;
		
	}
	public int pointsNeeded0(int[] pointsEarned, int[] pointsPossible, int finalExam) {
		for(int i=0; i <= finalExam; i++)
			if(ok(pointsEarned, pointsPossible, finalExam,i))
				return i;
		
		return -1;
	}
	boolean ok(int a[], int b[], int c, int d){
		int num  = d, den =c;
		for(int x : a) num +=x;
		for(int x: b) den +=x;
		return num*100 >= den * 65;
	}
}
