package com.evergent.corejava.static1;
//static method cannot access static variables and static method only
public class StaticDemo3 {
	static String cname="India";
	String name="Abhi";
	static public void myData() {
		//show(); will generate error
		System.out.println("MyData");
	}
	public void show() {
		System.out.println("show is non static method");		
	}
	public static void main(String[] args) {
		System.out.println(cname);
		myData();
	}
}
