package com.jeyrs.algorithms.datastructures;

public class SinglyLinkedList {
	public static void main(String [] args){
		SinglyLinkedList list = new SinglyLinkedList();
	
		list.addFirst(5);
		list.addFirst(6);
		list.addFirst(7);
		list.addFirst(8);
		list.addFirst(9);
		list.addFirst(10);
		list.addLast(10);
		list.addLast(10);
		
		System.out.println("List is " + list);
		list.remove(list.start, 8);
		
		System.out.println("List after removing " + list.start);
		
		list.removeLast(list.start);
		
		System.out.println("List after removing " + list.start);
		
		list.removeLast(list.start);
		
		System.out.println("List after removing " + list.start);
		
		System.out.println("List size" + list.size(list.start, 0));
		
		System.out.println("Found " + list.search0(list.start, 6));
		
		System.out.println("Index of 10 " + list.index(list.start, 10));
		
		list.append(list.start, 200);
		
		System.out.println("List after appending " + list.start);
	}
	Node start;
	Node end;
	public SinglyLinkedList(){
		this.start = null;
		this.end = null;
	}
	public boolean search0(Node start, int data){
		Node current = start;
		boolean found = false;
		
		while(current != null && !found)
			if(current.data == data) found = true;
			else current = current.next;
		return found;		
	}
	public boolean search(Node n, int data){
		if(n == null) return false;
		if(n.data == data) return true;
		return search(n.next, data);
	}
	public void addFirst(int data){
		Node n = this.start;
		this.start = new Node(n, data);
	}
	public void addLast(int data){
		Node n = this.start;
		while(n.next != null){
			n = n.next;
		}
		n.next = new Node(null, data);
		
	}
	public void append(Node start, int data){
		Node current = this.start;
		if(current == null){
			current = new Node(null, data);
			return;
		}
		while(current.next != null) current = current.next;
		current.next = new Node(null, data);
	}
	public int index(Node start, int data){
		Node current = start;
		int index = 0;
		
		boolean found = false;
		while(current != null && !found){
			if(current.data == data){
				found = true;
			}else{
				current = current.next;
			}
			index++;
		}
		if(found) return index - 1;
		return -1;
	}
	public void removeFirst(){
		Node n = start;
		if(n != null){
			start = start.next;
		}
	}
	public void removeLast(Node start){
		Node current = start;
		Node previous = null;
		while(current.next != null){
			previous = current;
			current = current.next;
		}
		if(previous == null){
			start = current.next;
		}else{
			previous.next = null; 
		}
	}
	public boolean isEmpty(Node start){
		return start == null;
	}
	public int size(Node start){
		Node current = start;
		int count = 0;
		while(current != null){
			current = current.next;
			count++;
		}
		return count;
	}
	public int size(Node start, int count){
		if(start == null) return count;
		count = count + 1;
		return size(start.next, count);
	}
	public void remove(Node start, int data){
		Node current = start;
		Node previous = null;
		boolean found = false;
		
		while(!found){
			if(current.data == data)
				found = true;
			else{
				previous = current;
				current = current.next;
			}
		}
		if(previous == null){
			start = current.next;
		}else{
			previous.next = current.next; 
		}
	}
	public String toString(){
		return start.toString();
	}
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
		Node(Node next, int data){
			this.next = next;
			this.data = data;
		}
		public boolean equals(Object obj){
			Node o = (Node)obj;
			return (o.data == data);
		}
		public String toString(){
			String result = "";
			Node current = this;
			while(current != null){
				result +=current.data+"->";
				current = current.next; 
			}
			return result+"tail";
		}
	}
}
