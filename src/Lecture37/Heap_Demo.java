package Lecture37;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<Integer> pq =  new PriorityQueue<>(); // MIN HEAP
		PriorityQueue<Integer> pq =  new PriorityQueue<>(Collections.reverseOrder()); // MAX HEAP
		
		pq.add(10);
		pq.add(0);
		pq.add(-1);
		pq.add(-2);
		pq.add(20);
		pq.add(100);
		pq.remove();
		pq.offer(10);
		pq.poll();
	}

}
