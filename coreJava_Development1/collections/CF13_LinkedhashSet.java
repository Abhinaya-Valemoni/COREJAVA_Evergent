package com.evergent.corejava.collections;
import java.util.LinkedHashSet;
public class CF13_LinkedhashSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <String> myset= new LinkedHashSet<>();
		myset.add("Apple");
		myset.add("Orange");
		myset.add("Banana");
		myset.add("Mango");
		myset.add("Grapes");
		System.out.println("LinkedHashSet :"+myset);
		//iterating through the LHS
		System.out.println("iterating through LHS");
		for(String fruit:myset)
		{
			System.out.println(fruit);
		}
		//checking element present or not
		System.out.println("does banana present:"+myset.contains("Banana"));
		//removing Banana
		myset.remove("Banana");
		System.out.println("After removing:"+myset);
		//Checking the size of LHS
		System.out.println("Size of LHS:"+myset.size());
		//clearing the LHS
		myset.clear();
		System.out.println("After clearing:"+myset);
	}
}
