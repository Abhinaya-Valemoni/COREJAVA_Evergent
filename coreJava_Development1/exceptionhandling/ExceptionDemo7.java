package com.evergent.corejava.exceptionhandling;
//try should be followed by either catch or finally block 
public class ExceptionDemo7 {
	String name=null;
	int k=0;
	
	public void myInfo() throws NullPointerException
	{
		System.out.println(name.length());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionDemo7 ed3=new ExceptionDemo7();
			
			ed3.myInfo();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}	
		
	}
}