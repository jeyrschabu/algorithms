package com.jeyrs.algorithms;

public class PillMonitor{
	public static void main(String [] args){
		State s = new State();
		s.numHalf = 1;
		s.numWhole = 3;
		System.out.println("Before " + s);
		simulate(s, 2);
		System.out.println("After " + s);
	}
	public static void simulate(State s, int numSteps){
		int total = s.numWhole + s.numHalf;
		
		int w = s.numWhole * 1/total;
		int h = s.numHalf * 1/total;
		
		for(int i=0; i < numSteps; i++){			
			if(h > w ){
				s.numHalf = s.numHalf - i;
			}else{
				s.numWhole = s.numWhole - i;
				s.numHalf = s.numHalf + i;
			}
		}
	}
}
class State {
	 public int numWhole;
	 public int numHalf;
	 public String toString(){
		 return "Whole " + numWhole + " Half "+ numHalf + "";
	 }
}


