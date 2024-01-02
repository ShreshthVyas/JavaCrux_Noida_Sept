package Lecture33;

import Lecture32.HasCycle.ListNode;

public class CycleRemoval {
	public class Node {
		int data;
		Node next;

		public Node() {

		}
//		  public Node(int data){
//			  this.data = data;
//		  }
	}

	private Node head;
	private Node tail;
	private int size;

	public int getsize() {
		return size;
	}

	public void addfirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			nn.next = head;
			this.head = nn;
			size++;
		}
	}

	public void addLast(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			this.tail.next = nn;
			this.tail = nn;
			size++;
		}
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			if(temp.next ==null) {
				System.out.print(temp.data);
			}
			else {
			System.out.print(temp.data + "=>");
			}
			temp = temp.next;
		}
		System.out.println();
	}
	public void createcycle() {
		tail.next = head.next.next;
	}
	 public Node hasCycle() {
         Node slow = head;
	     Node fast = head;
	       
	       while(fast != null && fast.next!=null) {
	    	   fast = fast.next.next;
	    	   slow = slow.next;
               if(fast == slow){
                   return slow;
               }
	       }
	       return null;
    }
	public void cycleremoval1() {
		Node meet = hasCycle();
		
		if(meet == null) {
			return;
		}
		Node start = head;
		while(start!=null) {
			Node temp = meet;
			while(temp.next!=meet) {
				if(temp.next==start) {
					temp.next =null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}
		
	}
	public void cycleremoval2() {
		Node meet = hasCycle();
		Node temp =meet;
		int count =1;
		
		//cycle count
		while(temp.next!= meet) {
			temp= temp.next;
			count++;
		}
		Node fast = head;
		Node slow = head;
		// Move fast count times 
		for (int i = 1; i <=count; i++) {
			fast= fast.next;
		}
		 
		// move fast and slow simaltaneously until both of their next isnt meet
		while(slow.next!=fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		
		fast.next =null;
	}
	
	public void FloyCycleRemoval() {
		Node meet = hasCycle();
		if(meet == null) {
			return;
		}
		Node slow =head;
		Node fast = meet;
		while(slow.next!=fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next =null;
	}
}
