package com.evergent.corejava.exceptionhandling;
//try should be followed by either catch or finally block 
public class ExceptionDemo6 {
	String name="null";
	int k=2;
	public void myData()
	{
		try
		{
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");
		}
		finally {
			System.out.println("finally block");
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo6 ed3=new ExceptionDemo6();
		ed3.myData();
	}
}