package com.evergent.corejava.static1;
//non static method can access static variables and static method only
public class StaticDemo5 {
	static final int i=6;
	static {
		System.out.println(i);
		System.out.println("hii");
	}
	static String cname="India";
	String name="Abhi";
	static {
		System.out.println("Abhi");
	}
	static public void myData() {
		System.out.println("MyData");
	}
	public void show() {
		myData();
		System.out.println("show is non static method");
	}
	public static void main(String[] args) {
		StaticDemo5 sd = new StaticDemo5();
		sd.show();
	}
}
