package com.evergent.corejava.oops;
class myBigData{
	public void myData() {
		System.out.println("Bigdata");
	}
	public void myData1() {
		System.out.println("Bigdata");
	}
}
public class methodOverriding extends myBigData {
	
	public void myData() {
		super.myData();
		//System.out.println(c);
		System.out.println("hii Bigdata");
		
	}
	public void show() {
		System.out.println("show");
	}
	public static void main(String[] args) {
		myBigData bd = new methodOverriding();
		//methodOverriding my=new methodOverriding();
		bd.myData();
		//bd.show();
		//my.myData("hii");
		//my.myData();		
		//my.myData1();
	}
}
