package com.evergent.corejava.queue;
import java.util.Deque;
import java.util.LinkedList;
public class Queue_linkedlist12 {
	public static void main(String[] args) {
		Deque<String> ad = new LinkedList();
		ad.add("Abhi");
		ad.add("Dhruthi");
		ad.add("Badhri");
		ad.add("Divya");
		System.out.println(ad);
		boolean t = ad.isEmpty();
		System.out.println(t);
		ad.clear();
		boolean b = ad.isEmpty();
		System.out.println(b);
		
	}

}
