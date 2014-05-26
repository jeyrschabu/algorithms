package com.jeyrs.algorithms.datastructures;
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
	/**
	 * NOT Tested. using an inorder traversal while checking
	 * @param tree
	 * @return
	 */
	public boolean checkIfBST(Tree tree){
		if(tree == null) return true;
		if(tree.left == null & tree.right == null) return true;
		
		boolean a = checkIfBST(tree.left);
		if(tree.data < tree.left.data || tree.data < tree.left.data) return false;
		boolean b = checkIfBST(tree.left);
		
		return a && b;
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
