package com.evergent.corejava.queue;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Queue_demo5 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
		while(!pq.isEmpty()) {
			pq.poll();
			System.out.println(pq);
		}
		
	}

}
