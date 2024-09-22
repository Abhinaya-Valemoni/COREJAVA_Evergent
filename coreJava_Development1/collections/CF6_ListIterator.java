package com.evergent.corejava.collections;
//arraylist using listiterator
import java.util.ArrayList;
import java.util.ListIterator;
public class CF6_ListIterator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list= new ArrayList();
		list.add("Abhi");
		list.add("Vinay");
//		list.add("Roshu");
//		list.add("Hari");
		ListIterator li=list.listIterator();
		li.add("hhh");// separate list irrespective of arraylist
		li.add("Welcome");
		
		while(li.hasNext())
		{
			String s= (String) li.next();
			System.out.println(s);
			if(s.equals("Roshu"))
				li.remove();
			}
		while(li.hasPrevious())
			System.out.println(li.previous());
	}
}