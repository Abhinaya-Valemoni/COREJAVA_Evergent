package com.evergent.corejava.stack;
import java.util.Stack;
public class Stack_Demo5_Methods {
	public static void main(String[] args) {
		Stack <String> stack=new Stack<>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		stack.push("Date");
		System.out.println("Stack:"+stack);
		String topElement=stack.pop();
		System.out.println("Top element:"+ topElement);
		String removedElement= stack.pop();
		System.out.println("Popped elements:"+removedElement);
		System.out.println("Stack after pop:"+stack);
		System.out.println("------------------------------");
		boolean isEmpty= stack.isEmpty();
		System.out.println("Is the stack empty?"+isEmpty);
		int position =stack.search("Banana");
		if(position!=-1)
		{
			System.out.println("Position od'Banana' from top:"+position);
		}
		else
		{
			System.out.println("'Banana' is not in the stack.");
		}
		stack.clear();
		System.out.println("stack after clearing:"+stack);
		boolean isEmpty1= stack.isEmpty();
		System.out.println("Is the stack empty?"+isEmpty1);
	}
}
