package Lecture33;
public class MergeSort_LinkedList {
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
	 public ListNode middleNode(ListNode head) {
	       ListNode slow = head;
	       ListNode fast = head;
	       
	       while(fast != null && fast.next!=null) {
	    	   fast = fast.next.next;
	    	   slow = slow.next;
	       }
	       return slow; 
	    }
	 public ListNode sortList(ListNode head) {
	        if(head ==null || head.next == null) {
	        	return head;
	        }
	        ListNode mid = middleNode(head);
	        ListNode midnext = mid.next;
	        mid.next =null;
	        ListNode A = sortList(head);
	        ListNode B = sortList(midnext);
	        return mergeTwoLists(A, B);
  
	  }
}
