package com.evergent.corejava.queue;
import java.util.PriorityQueue;
public class Queue_demo2 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		 pq.add(2);
        pq.add(20);
        pq.add(15);       
        pq.add(5);

		System.out.println(pq);
		
		
	}

}
