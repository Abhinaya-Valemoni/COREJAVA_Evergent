 package com.evergent.corejava.exceptionhandling;
class ProductNotFound extends Exception{
	public ProductNotFound(String message) {
		System.out.println("hello "+ message);
	}		
}
public class ProductImpl9 {
	public void myData() throws ProductNotFound{
		int k=105;
		if(k>100) {
			throw new ProductNotFound("hello");
		}
		else {
			System.out.println("hii");
		}
	}
	public static void main(String[] args) {
		try {
			ProductImpl9 pd =new ProductImpl9();
			pd.myData();			
		}
		catch(Exception e) {
			System.out.println("i can handle"+e);
		}
	}
}
