package com.jeyrs.algorithms.topcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class GrafixMask {	
	public static void main(String [] args){
		GrafixMask tmp = new GrafixMask();
		String res = Arrays.toString(tmp.sortedAreas(new String[]{"0 292 399 307"}));
		System.out.println(res);
		
		//String res1 = Arrays.toString(tmp.sortedAreas0(new String[]{"0 292 399 307"}));
		
		//System.out.println(res1);
	}
	/**
	 * recursive
	 */
	public int doFill(int x, int y, boolean[][] fill){
		//check to ensure that we are within the bounds of the grid, if not , return 0
		if(x < 0 || x >= 600) return 0;
		if(y < 0 || y >= 400) return 0;
		if(fill[x][y]) return 0;
		
		fill[x][y] = true;
		
		// Now we know that we have at least one empty square, then we will recursively attempt to
		 // visit every node adjacent to this node, and add those results together to return.
		return 1 + doFill(x - 1, y, fill) + doFill(x + 1, y, fill) + doFill(x, y + 1, fill) + doFill(x, y - 1, fill);
	}
	public int doFill0(int x, int y, boolean[][] fill){
		int result = 0;
		Stack<Node> stack = new Stack<Node>();
		stack.push(new Node(x, y));
		while(!stack.empty()){
			Node top = stack.pop();
			if(top.x < 0 || top.x >= 599) continue;
			if(top.y < 0 || top.y >= 399) continue;
			
			
			System.out.println("x => " + x);
			System.out.println("y => " + y);
			if(fill[top.x][top.y]) continue;
			
			fill[top.x][top.y] = true;
			result++;
			stack.push(new Node(top.x + 1, top.y));
			stack.push(new Node(top.x - 1, top.y));
			stack.push(new Node(top.x, top.y + 1));
			stack.push(new Node(top.x, top.y - 1));
		}
		return result;
	}
	//needs work
	public int[] sortedAreas0(String [] rectangles){
		boolean[][] grid = new boolean[400][600];
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i < 400; i++)
			for(int j = 0; j < 600; j++)
				grid[i][j] = false;
		
		for(int i= 0 ; i < rectangles.length; i++){
			String res[] = rectangles[i].split("\\s");
			for(int j = Integer.parseInt(res[0]); j<= Integer.parseInt(res[2]); j++){
				for(int k = Integer.parseInt(res[1]); k <= Integer.parseInt(res[3]); k++)
					grid[j][k] = true;
			}
		}
		
		for(int i=0; i< grid.length; i++)
			for(int j=0; j< grid.length; j++)
				if(!grid[i][j])
					list.add(doFill(i, j, grid));
		int res[] = new int[list.size()];
		for(int i =0; i < list.size(); i++)
			res[i] = list.get(i);
	
		Arrays.sort(res);
		
		return res;
		
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
					
					if(s.x < 0 || s.y < 0 || s.x >= 400 || s.y >= 600) 
						continue;
					if(!grid[s.x][s.y]) 
						continue;
					
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

