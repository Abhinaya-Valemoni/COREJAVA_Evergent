package com.evergent.corejava.constructor;
public class Employee2 {
	int eno;
	String ename;
	double sal;	
	Employee2(){
		System.out.println("Default constructor");		
	}	
	Employee2(int eno1, String ename1, double sal1){
		eno=eno1;
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
		new Employee2();
		new Employee2(730,"Abhi",500000);
		Employee2 emp = new Employee2(730,"Abhi",500000);
		emp.display();
	}
}
