package com.evergent.corejava.Strings;
public class StringsDemo2 {
	public static void main(String[] args) {
		String name= "java";
		String name1= "java";
		if (name==name1) //its checks for memory location it will true with string pool constant
			System.out.println("True");
		else
			System.out.println("False");
		if (name.equals(name1)) //its checks for content
			System.out.println("True");
		else
			System.out.println("False");
	}
}
