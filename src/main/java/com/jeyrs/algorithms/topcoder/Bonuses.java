package com.jeyrs.algorithms.topcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bonuses {
	public static void main(String args[]){
		Bonuses b = new Bonuses();
		int res[] = b.getDivision(new int[]{485, 324, 263, 143, 470, 292, 304, 188, 100, 254, 296,
				 255, 360, 231, 311, 275,  93, 463, 115, 366, 197, 470});
		System.out.println(Arrays.toString(res));	
	}
	public int[] getDivision(int [] points){
		if(points == null || points.length < 1 || points.length > 50) return null;
		int s = 0;
		List<Point> list = new ArrayList<Point>();
		for(int i=0; i < points.length; i++){
			s +=points[i];
		}
		for(int i=0; i < points.length; i++){
			list.add(new Point(points[i], s));
		}
		double wholeSum = 0;
		for(Point p : list){
			wholeSum +=p.percentage;
		}
		int remains = (int)(100 - wholeSum) ;
		
		List<Point> tmp = new ArrayList<Point>(list);
		Collections.sort(tmp);

		List<Integer> topList = new ArrayList<Integer>();
		for(int i = 1; i <= remains; i++){
			topList.add(tmp.get(tmp.size() - i).value);
		}
		
		int [] result = new int[points.length];
		int i = 0;
		for(Point p : list){
			if(topList.contains(p.value)){
				topList.remove((Integer)p.value);
				p.bonus +=1;
			}
			result[i++] = p.bonus;
		}
		return result;
	}
}
class Point implements Comparable<Point>{
	public int value;
	public int bonus;
	public double percentage;
	Point(int v, int sum){
		value = v;
		setPercentageAndBonus(v, sum);
	}
	void setPercentageAndBonus(int value, int sum){
		double tmp = divide(value, sum);
		bonus = (int) tmp;
		percentage = (tmp - (tmp - ((int)tmp)));
	}
	double divide(int point, int s) {
		return Math.ceil((point * 100/s));
	}
	public int compareTo(Point p2) {
		Point p1 = this;
		if(p1.value < p2.value) return -1;
		if(p1.value > p2.value) return 1;
		return 0;
	}
}