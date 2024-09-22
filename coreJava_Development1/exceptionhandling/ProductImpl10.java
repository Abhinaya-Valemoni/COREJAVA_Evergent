package com.evergent.corejava.exceptionhandling;
class AgeNotSupport extends Exception{
	public AgeNotSupport(String message) {
		System.out.println("hello "+ message);
	}		
}
public class ProductImpl10 {
	public void myData() throws AgeNotSupport{
		int age=17;
		if(age<18) {			
			throw new AgeNotSupport("U're age is not elegible to vote");			
		}
		else {
			System.out.println("u can vote");
		}
	}
	public static void main(String[] args) {
		try {
			ProductImpl10 pd =new ProductImpl10();
			pd.myData();
			
		}
		catch(Exception e) {
			System.out.println("i can handle"+e);
		}
	}
}
