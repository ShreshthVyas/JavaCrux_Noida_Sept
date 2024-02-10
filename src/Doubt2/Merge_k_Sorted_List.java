package Doubt2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_Sorted_List {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode>  pq = new PriorityQueue<>(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val-o2.val;
			}
		});
		ListNode dummy = new ListNode();
		ListNode temp = dummy;
		for (ListNode nn : lists) {
			if(nn!=null) {
				pq.add(nn);
			}
		}
		
		while(!pq.isEmpty()) {
			ListNode nn = pq.poll();
			if(nn.next!=null) {
				pq.add(nn.next);
			}
			dummy.next = nn;
			dummy = dummy.next;
		}
		
		return temp.next;
	}
}
