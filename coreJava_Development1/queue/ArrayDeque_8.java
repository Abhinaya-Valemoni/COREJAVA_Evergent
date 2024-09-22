package com.evergent.corejava.queue;
import java.util.ArrayDeque;
public class ArrayDeque_8 {
	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("Abhi");
		ad.addFirst("Dhruthi");
		ad.add("Badhri");
		ad.addLast("Divya");
		ad.offerFirst("hii");
		ad.offerLast("hru");
		ad.offer("hello");
		
		System.out.println(ad);
		
	}

}
