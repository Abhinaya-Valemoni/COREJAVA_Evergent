package com.evergent.corejava.Strings;
public class StringBuilder_methods {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("original String:"+sb);
		System.out.println("append String:"+sb.append("World!"));
		System.out.println("insert String:"+sb.insert(7,"beautiful"));
		System.out.println("replace String:"+sb.replace(0,5,"hi"));
		System.out.println("delete String:"+sb.delete(0,3));
		System.out.println("reverse String:"+sb.reverse());
	}
}
