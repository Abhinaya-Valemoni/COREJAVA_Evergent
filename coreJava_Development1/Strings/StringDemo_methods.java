package com.evergent.corejava.Strings;

public class StringDemo_methods {
	public static void main(String[] args) {
		String name=new String("  Hello world   ");
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.strip());
		System.out.println(name.stripTrailing());
		System.out.println(name.trim());
		//stripLeading(): Removes only leading whitespace (Java 11+).
		//stripTrailing(): Removes only trailing whitespace (Java 11+).
	}
}
