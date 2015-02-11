package com.jeyrs.algorithms.datastructures.extra;

import java.util.Comparator;

public class SinglyLinkedList<T> {
	class Node{
		int data;
		Node next;
		public Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
		public Node(){}
	
		public String toString(){
			Node current = this;
			String ret = "";
			while(current != null && current.next != null){
				ret += current.data + "->";
				current = current.next;
			}
			if(current != null) ret += current.data;
			return ret;
		}
		public Node reverse(){
			Node n = this;
			Node current = n;
			Node previous = null;
			Node next;
			while(current != null){
				next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
			n = previous;
			return n;
		}
	}
	Node start;
	
	public SinglyLinkedList (){
		this.start = null;
	}
	public void add(int data){
		Node current = this.start;
		if(current == null){
			current = new Node(data, null);
			start = current; //update the head for class visibility
			return;
		}
		while(current.next != null){
			current = current.next;
		}
		current.next = new Node(data, null);
	}
	public boolean search(int data){
		Node current = start;
		boolean found = false;
		while(current != null && !found){
			if(current.data == data){
				found = true;
			}
			current = current.next;
		}
		return found;
	}
	public void reverse(){
		start = start.reverse();
	}
	public boolean isPalindrome(){
		return isPalindrome(start);
	}
	private boolean isPalindrome(Node head){
		Node current = head;
		int len = 0;
		while(current != null){
			current = current.next;
			len++;
		}
		int n = len/2;//middle
		current = head;
		int i = 0;
		while(i++ <= n)current = current.next;
		
		//now current contains the second half of the list
		Node previous = null, next;
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		Node first = head;
		Node second = previous;//the reversed list
		 
		
		while(first != null && second != null){
			if(first.data != second.data) return false;
			first = first.next;
			second = second.next;
		}
		return true;
	}
	
	public void reverseNthNodeFromLast(int n){
		start= reverseNthNodeFromLast(start, n);
	}
	public void mergeSortedLists(SinglyLinkedList list){
		Node toCompare = list.start;
		start = mergeSortedLists(start, toCompare);
	}
	public void sumLists(SinglyLinkedList list){
		Node toAdd = list.start;
		start =sumLists(start, toAdd); 
	}
	private Node mergeSortedListsRecursive(Node l1, Node l2){
		Node result = null;
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		if((Integer)l1.data <= (Integer)l2.data){
			result = l1;
			result.next = mergeSortedListsRecursive(l1.next, l2);
		}else{
			result = l2;
			result.next = mergeSortedListsRecursive(l1, l2.next);
		}
		return result;
	}
	//TODO revisit
	private Node sumLists(Node l1, Node l2){
		Node res = null;
		Node tmp = null, prev = null;
		int carry = 0, sum;
		
		while(l1 != null || l2 != null){
			int left = (l1 != null) ? l1.data : 0;
			int right = (l2 != null) ? l2.data : 0;
			sum = left + right + carry;
			carry = (sum >= 10) ? 1 : 0;
			sum %= 10;
			tmp = new Node(sum, null);
			
			if(res == null) res = tmp;
			else prev.next = tmp;
				
			prev = tmp;
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		if(carry > 0 ) {
			res.data++;
			//tmp.next = new Node(carry, null);
		}
		
		
		return res;
	}
	private Node mergeSortedLists(Node l1, Node l2){
		Node p1 = l1, p2 = l2;
		
		Node fakehead = new Node(p1.data, null);
		Node p = fakehead;
		
		while(p1 != null && p2 != null){
			if((Integer)p1.data <= (Integer)p2.data){
				p.next = p1;
				p1 = p1.next;
			}else{
				p.next = p2;
				p2 = p2.next;
			}
			p = p.next;
		}
		if(p1 != null)p.next = p1;
		if(p2 != null)p.next = p2;
		
		return fakehead.next;
		
		
	}
	private Node reverseNthNodeFromLast(Node head, int n){
		Node p1 = head, p2 = head;
		int count = 0, i = 0;
		//find the nth node
		while(count++ < n)
			if(p2 == null) return null;
			else
				p2 = p2.next;
		while(p2 != null){
			p2 = p2.next;
			p1 = p1.next;
			i++;
		}
		//reverse
		Node current = p1;
		Node previous = null;
		Node next;
		
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		current = previous;
		if(i <= 0) return current;
		
		//attach the beginning of the list to the reverse portion
		Node tmp = head;
		while(--i > 0){
			tmp = tmp.next;
		}
		tmp.next = current;
		
		current = head;
		return current;
	}
	private void printNthFromLast0(Node head, int n){
		Node p1 = head, p2 = head;
		int count = 0;
		while(count++ < n)
			if(p2 == null) return;
			else
				p2 = p2.next;
		while(p2 != null){
			p2 = p2.next;
			p1 = p1.next;
		}
		System.out.println(p1);
	}
	private void printNthFromLast(Node head, int n){
		int len = 0;
		Node current = head;
		while(current != null){
			current = current.next;
			++len;
		}
		if(len < n) return;
		current = head;
		
		for(int i = 1; i < len - n + 1; i++){
			current = current.next;
		}
		System.out.println(current);
	}
	public void printNthFromLast(int n){
		
		printNthFromLast(start, n);
	}
	public void printNthFromLast0(int n){
		
		printNthFromLast0(start, n);
	}
	public boolean search0(int data){
		Node current = start;
		return search(current, data);
	}
	public boolean remove(int data){
		return remove(start, null, data);
	}
	public int size(){
		Node current = start;
		int count = 0;
		while(current != null){
			current = current.next;
			count++;
		}
		return count;
	}

	public boolean isEmpty(){
		return size() == 0;
	}
	public boolean remove(Node n, Node previous, int data){
		Node current = n;
		if(current == null) return false;
		if(data == current.data) {
			if(null == previous){
				current = current.next;
				start = current; //update the head for class visibility
				return true;
			}else{
				previous.next = current.next;
			}
		}
		return remove(current.next, current, data);
	}
	public boolean search(Node n, int data){
		Node current = n;
		if(current == null) return false;
		if(data == current.data) return true;
		
		return search(current.next, data);
	}
	public String toString(){
		if(this.start != null) return this.start.toString();
		return null;
	}
	public static void main(String args[]){
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
				
		System.out.println("List before is " + list);
		
		
		//list.remove(8);
		//list.remove(1);
		//list.remove(4);
		
		//System.out.println(list);
		//list.reverse();
		//System.out.println(list);
		
		list.printNthFromLast(3);
		//list.printNthFromLast0(2);
		list.reverseNthNodeFromLast(3);
		System.out.println("List after is " + list);
		
		SinglyLinkedList<Integer> list1 = new SinglyLinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		
		
		System.out.println("List1 => " + list1);
		
		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
		
		list2.add(6);
		list2.add(9);
		
		
		System.out.println("List2 => " + list2);
		
		list1.sumLists(list2);
		
		//System.out.println(list1);
		//list1.mergeSortedLists(list2);
		
		System.out.println("List after is => " + list1);
		
		SinglyLinkedList<Integer> list3 = new SinglyLinkedList<Integer>();
		
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(2);
		list3.add(1);
		System.out.println("List3 " + list3 + " is palindrome "+list3.isPalindrome());
	}
}
