package com.evergent.corejava.generalprogramming;
enum Colour{
	Red,Green,Blue;
}
enum day{
	Sun,Mon,Tue,wed,Thurs,fri,Sat,sun;
}

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colour c=Colour.Red;
		System.out.println("My dress colour is " + c);
		day Holiday=day.sun;
		System.out.println("Holiday= "+Holiday);

	}

}
