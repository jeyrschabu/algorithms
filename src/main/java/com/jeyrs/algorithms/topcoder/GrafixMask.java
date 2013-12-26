package com.jeyrs.algorithms.topcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class GrafixMask {	
	public static void main(String [] args){
		GrafixMask tmp = new GrafixMask();
		String res = Arrays.toString(tmp.sortedAreas(new String[]{"0 292 399 307"}));
		System.out.println(res);
		
		Float f = new Float(54000000);
	}
	public int[] sortedAreas(String [] rectangles){
		boolean[][] grid = new boolean[400][600];
		for(int i=0; i < 400; i++)
			for(int j = 0; j < 600; j++)
				grid[i][j] = true;
		
		for(int i= 0 ; i < rectangles.length; i++){
			String res[] = rectangles[i].split("\\s");
			for(int j = Integer.parseInt(res[0]); j<= Integer.parseInt(res[2]); j++){
				for(int k = Integer.parseInt(res[1]); k <= Integer.parseInt(res[3]); k++)
					grid[j][k] = false;
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		
		for(int i = 0; i < 400; i++){
			for(int j = 0; j < 600; j++){
				int result = 0;
				if(grid[i][j])
					stack.push(new Node(i, j));
				while(!stack.empty()){
					Node s = stack.pop();
					
					if(s.x < 0 || s.y < 0 || s.x >= 400 || s.y >= 600) continue;
					if(!grid[s.x][s.y]) continue;
					
			        grid[s.x][s.y] = false;
					result++;
					
					stack.push(new Node(s.x + 1, s.y));
					stack.push(new Node(s.x - 1, s.y));
					stack.push(new Node(s.x, s.y + 1));
					stack.push(new Node(s.x, s.y - 1));
				}
				if(result != 0)list.add(result);
			}
		}
		int ret[] = new int[list.size()];
		for(int i =0; i < list.size(); i++)
			ret[i] = list.get(i);
	
		Arrays.sort(ret);
		return ret;
	}
}
class Node{
	int x, y;
	public Node(int i, int j){
		x = i;
		y = j;
	}
	public String toString(){
		return "NODE: x => " + x + ", y => " + y;
	}
}

