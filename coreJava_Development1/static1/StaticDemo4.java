package com.evergent.corejava.static1;
//non static method can access static variables and static method only
public class StaticDemo4 {
	static String cname="India";
	String name="Abhi";
	static public void myData() {
		System.out.println("MyData");
	}
	public void show() {
		myData();
		System.out.println("show is non static method");
	}
	public static void main(String[] args) {
		StaticDemo4 sd = new StaticDemo4();
		sd.show();
	}
}
