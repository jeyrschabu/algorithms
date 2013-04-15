package com.jeyrs.algorithms;
/*
 * checks if a tree is a BST
 */
public class CheckIfBST {
	public boolean checkIfBST(Tree tree, int small, int large){
		if(tree == null) return true;
		if(tree.data > small && tree.data < large){
			boolean left = checkIfBST(tree.left, small, tree.data);
			boolean right = checkIfBST(tree.right, tree.data, large);
			
			return left && right;
		}
		return false;
	}
}
class Tree{
	Tree left;
	Tree right;
	int data;
	public Tree(int d){
		left = right = null;
		data = d;
	}
	
}
