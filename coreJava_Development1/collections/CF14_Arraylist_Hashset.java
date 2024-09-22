package com.evergent.corejava.collections;
import java.util.*;
public class CF14_Arraylist_Hashset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list=new ArrayList<>();
		list.add("core java");
		list.add("j2ee");
		list.add("j2se");
		list.add("my java");
		System.out.println(list);
		Set <String> s= new HashSet<>();
		s.addAll(list);
		System.out.println(s);
		Set <String> s1= new HashSet<>();
		s1.add("core java");
		s1.add("j2ee");
		s1.add("j2se");
		s1.add("my java");
		s1.add("core java");
		s1.add("Hello");
		//comparing list and set
		if(s.equals(s1))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		System.out.println(s.containsAll(s1));
		if(list.equals(s1))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}
}