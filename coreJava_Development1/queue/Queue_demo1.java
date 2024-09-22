package com.evergent.corejava.queue;
import java.util.PriorityQueue;
public class Queue_demo1 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
		
	}

}
