package com.jeyrs.algorithms.datastructures;

public class TreeNode {
	private TreeNode parent;
	private TreeNode left;
	private TreeNode right;
	private int data;
	
	public TreeNode(TreeNode left, TreeNode right, TreeNode parent, int data){
		this.parent = parent;
		this.right = right;
		this.left = left;
		this.data = data;
	}
	
	TreeNode search(TreeNode l, int data){
		if(l == null) return null;
		if(l.data == data) return l;
		if(data < l.data) return search(l.left, data);
		else
			return search(l.right, data);
	}
	TreeNode minimum(TreeNode l){
		
		TreeNode min = l;
		if(l == null) return null;
		
		while(min.left != null){
			min = min.left;
		}
		return min;
	}
	void traverse(TreeNode l){
		if(l == null){
			traverse(l.left);
			//process stuff here
			traverse(l.right);
		}
	}
	void insert(TreeNode l, int data, TreeNode parent){
		TreeNode p;
		if(l == null){
			p = new TreeNode(null, null, parent, data);
			return;
		}
		if(data < l.data)
			insert(l.left, data, l);
		else 
			insert(l.right, data, l);
	}
}
