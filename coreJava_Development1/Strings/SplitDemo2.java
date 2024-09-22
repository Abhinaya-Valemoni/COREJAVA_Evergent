package com.evergent.corejava.Strings;

public class SplitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new String("Hello World");
		String[] words = str.split(" ");
		//using for each loop
		for(String w:words) {
			System.out.println(w);
		}
	}

}
