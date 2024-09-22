package com.evergent.corejava.Strings;
public class StringsDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= new String("Java");
		String name1= new String("Java");
		if (name==name1) //its checks for memory location
			System.out.println("True");
		else
			System.out.println("False");
		if (name.equals(name1)) //its checks for content
			System.out.println("True");
		else
			System.out.println("False");
	}
}
