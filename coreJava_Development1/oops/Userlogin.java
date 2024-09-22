package com.evergent.corejava.oops;
public class Userlogin {
	public void  loginDetails() {
		System.out.println("login Details");
	}
	public void  loginDetails(String Username, String pass) {
		System.out.println("Username: "+Username);
		System.out.println("Password "+ pass);
	}
	public void  loginDetails(int mobile, String pass) {
		System.out.println("number: "+mobile);
		System.out.println("Password "+ pass);
	}
	public void  loginDetails(int mobile, String pass,String captche) {
		System.out.println("number: "+mobile);
		System.out.println("Password "+ pass);
		System.out.println("captche "+ captche);
	}
	public void show() {
		System.out.println("hii");
	}
	public static void main(String[] args) {
		Userlogin user=new Userlogin();
		user.loginDetails();
		user.loginDetails("Abhi","123");
		user.loginDetails(1234556,"123");
		user.loginDetails(1234556,"123","abv");
		user.show();
	}
}
