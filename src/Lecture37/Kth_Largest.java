package Lecture37;

import java.util.PriorityQueue;

public class Kth_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findKthLargest(int[] arr, int k) {
		PriorityQueue<Integer> pq =  new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		
		for (int i = k; i < arr.length; i++) {
			if(arr[i]>pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		
		return pq.peek();
		
	}

}
