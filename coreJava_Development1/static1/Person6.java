package com.evergent.corejava.static1;
public class Person6 {
	static String name="Abhi";
	int age=22;
	String address="Hyd";
	public void display() {
		name="Welcome";//static in nonb static can be accessed
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6 p1=new Person6();
		System.out.println(p1.name);
		p1.display();
		Person6 p2=new Person6();
		System.out.println(p2.name);
	}
}
