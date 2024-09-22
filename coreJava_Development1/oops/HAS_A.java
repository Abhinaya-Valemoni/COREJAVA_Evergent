package com.evergent.corejava.oops;

public class HAS_A {
	public void mydata() {
		System.out.println("has_a");
	}
	public static void main(String[] agrs) {
		Person person=new Person();
		person.details();
		HAS_A mi=new HAS_A();
		mi.mydata();
	}

}
