package com.evergent.corejava.StringsImmutable;
//making String immutable
public class PersonImmutale {
	private final String name;
	private final int age;
	public PersonImmutale(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	public String Myname() {
		return name;
	}
	public int Myage() {
		return age;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutale person=new PersonImmutale("Raju",30);
		System.out.println(person.name);
		System.out.println(person.age);
		

	}

}
