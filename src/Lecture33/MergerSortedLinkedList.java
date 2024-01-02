package Lecture33;

import Lecture32.HasCycle.ListNode;

public class MergerSortedLinkedList {

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
	
	class Solution {
	    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
	        ListNode temp = new ListNode();
	        ListNode dummy =temp; // merges list ka head yaad rakhne ke liye
	        ListNode A = headA;
	        ListNode B = headB;
	        
	        while(A!=null && B!=null) {
	        	if(A.val <B.val) {
	        		temp.next = A;
	        		A = A.next;
	        		temp = temp.next;
	        	}
	        	else {
	        		temp.next = B;
	        		B = B.next;
	        		temp = temp.next;
	        	}
	        }
	        
	        if(B == null) {
	        	temp.next =A;
	        }
	        if(A == null) {
	        	temp.next =B;
	        }
	        return dummy.next;
	    }
	}

}
