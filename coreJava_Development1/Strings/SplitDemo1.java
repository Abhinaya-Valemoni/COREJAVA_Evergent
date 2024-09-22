package com.evergent.corejava.Strings;

public class SplitDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new String("Hello World");
		String[] words = str.split(" ");
		//using for loop
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}

	}

}
