package com.evergent.corejava.queue;
import java.util.PriorityQueue;
public class Queue_demo3 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.offer(9);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.remove());
		pq.clear();
		System.out.println(pq);
		
	}

}
