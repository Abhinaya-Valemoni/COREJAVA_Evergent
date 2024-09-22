package com.evergent.corejava.stack;
import java.util.Stack;
public class Stack_Demo4 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("Red");
		myStack.push("Balck");
		myStack.push("White");
		System.out.println(myStack);
		boolean b = myStack.isEmpty();
		System.out.println(b);
		myStack.clear();
		System.out.println(myStack);
		boolean a = myStack.isEmpty();
		System.out.println(a);
	}
	
}
