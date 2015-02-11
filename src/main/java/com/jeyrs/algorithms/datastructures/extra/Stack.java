package com.jeyrs.algorithms.datastructures.extra;


public class Stack {
	int top;
	public int[] s;
	public Stack(int max){
		s = new int[max];
		top = -1;
	}
	
	public boolean isEmpty(){
		return top < 0;
	}
	public void push(int i) {
		s[++top] = i;
	}
	public int pop() {
		return s[top--];
	}
	public int peek(){
		return s[top];
	}
	public int size(){
		return top + 1;
	}
	public String toString(){
		String ret = "";
		for(int i = 0; i <= top; i++){
			ret += s[i]+" ->";
		}
		return ret;
	}
	public Stack sort(Stack stack){
		Stack tmp = new Stack(stack.size());
		tmp.push(stack.pop());
		while(!stack.isEmpty()){
			int val = stack.pop();
			while(!tmp.isEmpty())
				if(tmp.peek() > val )stack.push(tmp.pop());
				else break;
			tmp.push(val);
		}
		return tmp;
	}
	public static void main(String args[]){
		Stack stack = new Stack(10);
		//System.out.println(stack.isEmpty());
		stack.push(0);
		stack.push(2);
		stack.push(4);
		stack.push(1);
		System.out.println(stack);
		//System.out.println(stack.size());
		//System.out.println(stack.isEmpty());
		
		/*System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.size());*/
		//stack.sort(stack);
		System.out.println("sorted =>" + stack.sort(stack));
		
	}


}
