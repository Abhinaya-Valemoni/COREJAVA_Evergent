package com.evergent.corejava.oops;

public class Person {
	String name ="Abhi";
	int age=22;
	String address="Mahabubnagar";
	public void details() {
		System.out.println("her name is "+name+" "
		+ "with age "+age+ " stays in "+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person info=new Person();
		info.details();
	}
}
