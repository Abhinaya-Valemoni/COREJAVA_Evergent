package com.evergent.corejava.exceptionhandling;
public class ExceptionDemo8 {
	String name="";
	int k=0;	
	public void myInfo() throws NullPointerException
	{
		System.out.println(name.length());
	}
	public void myData() throws ArithmeticException
	{	
			System.out.println("one");			
			int t=10/k;
			System.out.println("End");			
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo8 ed3=new ExceptionDemo8();
			ed3.myData();
			ed3.myInfo();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}		
	}
}