package com.evergent.corejava.exceptionhandling;
public class StackOverflowErrorExample {
	public static void main(String[] args) {
		try
		{
			recursiveMethod();
		}
		catch(StackOverflowError e)
		{
			System.out.println("StackOverflow errror caught:"+e.getMessage());
		}
	}
	public static void recursiveMethod()
	{
		recursiveMethod();// the method keeps calling itself
	}
}