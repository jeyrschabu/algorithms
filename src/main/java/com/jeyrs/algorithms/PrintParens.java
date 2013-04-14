package com.jeyrs.algorithms;

public class PrintParens {
	public static void main(String [] args){
		printParens(3,3,"");
	}
	public static void printParens(int remainingLeft, int remainingRight, String str){
		if(remainingRight == 0){//all printed out
			System.out.println(str);
			return;
		}
		if(remainingLeft > 0){//more left parens to print
			printParens(remainingLeft-1,remainingRight,str+"(");
			if(remainingLeft < remainingRight){
				printParens(remainingLeft,remainingRight-1,str+")");
			}
		}else
			printParens(remainingLeft,remainingRight-1,str+")");
	}
}
