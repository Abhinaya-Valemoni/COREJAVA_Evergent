package com.evergent.corejava.constructor;
//SUPER: WE'LL CALL SUPER CLASS 
class MyEmployee{
	int eno;
	public MyEmployee() {		
	}
	MyEmployee(int eno){
		System.out.println(eno);
	}
}
public class Employee6 extends MyEmployee {
	int eno;
	String ename;
	double sal;	
	Employee6(){
		System.out.println("Default constructor");
	}
	Employee6(int eno){
		this.eno=eno;
	}
	Employee6(int eno, String ename){
		super(eno);//will send eno number to MyEmployee class
		this.ename=ename;
	}
	public void display() {
				System.out.println(ename);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee6();
		Employee6 emp = new Employee6(730,"Abhi");
		emp.display();
	}
}
