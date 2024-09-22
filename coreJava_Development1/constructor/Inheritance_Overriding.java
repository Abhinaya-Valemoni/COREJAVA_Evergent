package com.evergent.corejava.constructor;
class Animal
{
	private String name;
	private int age;
	Animal(){
		System.out.println();
	}
	public Animal(String name, int age)//constructor
	{
		this.name=name;
		this.age=age;
	}	
	public void displayInfo() //method
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
class Dog extends Animal //subclass inheritance
{
	private String breed;
	public Dog(String name,int age, String breed)
	{
		super(name,age);//call to super class constructor
		this.breed=breed;
	}
	public void displayInfo() //method overriding
	{
		super.displayInfo();
		System.out.println("Breed:"+breed);
	}
}
public class Inheritance_Overriding {
	public static void main(String[] args) {
		Dog dog=new Dog("Buddy",6,"Golden Retriever");
		dog.displayInfo();
	}
}

