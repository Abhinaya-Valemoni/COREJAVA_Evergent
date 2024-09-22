package com.evergent.corejava.queue;
import java.util.ArrayDeque;
public class ArrayDeque_7 {
	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("Abhi");
		ad.add("Dhruthi");
		ad.add("Badhri");
		ad.add("Divya");
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.poll());
		System.out.println(ad.peek());
		
	}

}
