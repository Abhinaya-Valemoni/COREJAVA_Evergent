package com.evergent.corejava.constructor;
public class Student9 {
	String name;
	int age;
	public Student9(String name,int age) //constructor
	{
		this.name=name;
		this.age=age;
	}
	public Student9(Student9 s) //copy Constructor
	{
		this.name=s.name;
		this.age=s.age;
	}
	public void displayDetails() //method
	{
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
	}
	public static void main(String[] args) {
		Student9 student1= new Student9("Abhi",21);
		Student9 student2=new Student9(student1);
		student1.displayDetails();
		student2.displayDetails();

	}
}
