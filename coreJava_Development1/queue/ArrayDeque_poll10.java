package com.evergent.corejava.queue;
import java.util.ArrayDeque;
public class ArrayDeque_poll10 {
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
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		System.out.println(ad.remove());
		System.out.println(ad.removeFirst());
		System.out.println(ad.removeLast());
		
	}

}
