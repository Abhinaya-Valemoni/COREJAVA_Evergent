package com.evergent.corejava.exceptionhandling;
//all exception are executed while abnormal conditions only
//Normal flow it won't execute any exception
//Once any exception are occured in java code then remaining lines of codes is unreachable
public class ExceptionDemo2 {	
	String name=null;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
		}
		catch(NullPointerException e) {
			System.out.println("i can handle ");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo2 ed=new ExceptionDemo2();
		ed.myData();
	}
}
