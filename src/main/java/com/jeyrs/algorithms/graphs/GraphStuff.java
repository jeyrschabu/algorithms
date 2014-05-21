package com.jeyrs.algorithms.graphs;

public class GraphStuff {

	
}
class Node{
	int y;
	int weight;
	Node next;
}
class Graph{
	
	int max;
	Node [] edges;
	int degree[];
	int nvertices;
	int nedges;
	boolean directed;
	
	Graph(int aMax, int nvertices, int nedges){
		this.max = aMax;
		edges = new Node[aMax];
		degree = new int[aMax];
		this.nedges = nedges;
		this.nvertices = nvertices;
	}
	Graph initializeGraph(Graph g, boolean directed){
		g.nvertices = 0;
		g.nedges = 0;
		g.directed = directed;
		
		for(int i=0; i<= max; i++) 
			g.degree[i] = 0;
		for(int i=0; i<= max; i++) 
			g.edges[i] = null;
		
		return g;
	}
	void readGraph(Graph g, boolean directed, boolean matrix[][]){
		g = initializeGraph(g, directed);
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[0].length; col++){
				if(matrix[row][col]){
					insertEdge(g, row, col, directed);
				}
			}
		}
		
	}
	private void insertEdge(Graph g, int row, int col, boolean directed) {
		
	}
}
