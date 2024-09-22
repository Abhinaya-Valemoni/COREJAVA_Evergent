package com.evergent.corejava.constructor;

public class Employee5 {
	int eno;
	String ename;
	double sal;	
	Employee5(){
		System.out.println("Default constructor");
	}
	Employee5(int eno){
		this.eno=eno;
	}
	Employee5(int eno, String ename1, double sal1){
		this(eno);//call one constructor to other constructor with in class
		ename=ename1;
		sal=sal1;
	}
	public void display() {
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee5();
		Employee5 emp = new Employee5(730,"Abhi",500000);
		emp.display();
	}
}
