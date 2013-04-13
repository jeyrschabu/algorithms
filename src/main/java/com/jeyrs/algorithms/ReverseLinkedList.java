package com.jeyrs.algorithms;
/**
 * given a list 1->2->3 , returns 3->2->1
 */
public class ReverseLinkedList {
	public static Node reverseLinkedList(Node n){
		if (n == null || n.next == null)
			return n;
		Node r = reverseLinkedList(n.next);
		n.next.next = n; // get the tail
		n.next = null;
		
		return r;
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
	public String toString(){
		String result = "";
		Node current = this;
		while(current != null){
			result +=data+"->";
			current = current.next; 
		}
		return result;
	}
}
