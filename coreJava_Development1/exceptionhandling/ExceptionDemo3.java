package com.evergent.corejava.exceptionhandling;
//multiple exception
//if 2 exception occurs then 1st exception will comes at prior and stops executing
public class ExceptionDemo3 {
	String name=null;
	int k=0;
	public void myData()
	{
		try
		{
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");
		}
		catch(ArithmeticException e)
		{
			System.out.println("I can handle:"+e);
		}
			catch(NullPointerException e)
			{
				System.out.println("I can handle:"+e);
			}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo3 ed3=new ExceptionDemo3();
		ed3.myData();
	}
}