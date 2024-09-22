package com.evergent.corejava.stack;
import java.util.Stack;
public class Stack_Demo3 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("Red");
		myStack.push("Balck");
		myStack.push("White");
		System.out.println(myStack);
		System.out.println(myStack.search("White"));
		System.out.println(myStack.search("Red"));
	}
}
