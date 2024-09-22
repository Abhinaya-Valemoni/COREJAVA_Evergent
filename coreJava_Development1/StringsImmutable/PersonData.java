package com.evergent.corejava.StringsImmutable;
class Person1{
	String name;
	int age;
	public Person1(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {//this will override and execute implicitly
		return name+age;		
	}
}

public class PersonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1=new Person1("Shannu", 25);
		System.out.println(p1);
		System.out.println(p1.hashCode());

	}

}
