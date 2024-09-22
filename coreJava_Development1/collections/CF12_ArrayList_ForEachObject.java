package com.evergent.corejava.collections;
import java.util.*;
public class CF12_ArrayList_ForEachObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> mylist=new ArrayList<>();
		mylist.add(100);
		mylist.add("hello");
		mylist.add("Dhruti");
		mylist.add(21.3);
		mylist.add(22);
		for(Object e : mylist)
		{
			System.out.println(e);
		}
	}
}
