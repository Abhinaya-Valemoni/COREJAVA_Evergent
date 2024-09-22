package com.evergent.corejava.constructor;

public class Employee3 {
	int eno;
	String ename;
	double sal;	
	Employee3(){
		System.out.println("Default constructor");
	}
	Employee3(int eno, String ename, double sal){
		this.eno=eno;
		this.ename=ename;
		sal=sal;
	}
	public void display() {
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee3();
		Employee3 emp = new Employee3(730,"Abhi",500000);
		emp.display();
	}
}
