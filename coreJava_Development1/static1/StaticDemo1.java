package com.evergent.corejava.static1;
//we can access static variable and method without obj creation
public class StaticDemo1 {
	static String name="India";
	static public void myData() {
		System.out.println("MyData");
	}
	public static void main(String[] args) {
		System.out.println(StaticDemo1.name);
		StaticDemo1.myData();
	}
}
