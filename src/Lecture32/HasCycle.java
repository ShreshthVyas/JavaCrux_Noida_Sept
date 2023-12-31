package Lecture32;

import Lecture32.MiddleLinkedList.ListNode;

public class HasCycle {
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
		 public boolean hasCycle(ListNode head) {
	         ListNode slow = head;
		       ListNode fast = head;
		       
		       while(fast != null && fast.next!=null) {
		    	   fast = fast.next.next;
		    	   slow = slow.next;
	               if(fast == slow){
	                   return true;
	               }
		       }
		       return false;
	    }
	}
}
