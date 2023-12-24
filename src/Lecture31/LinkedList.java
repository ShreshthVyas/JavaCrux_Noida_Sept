package Lecture31;

public class LinkedList {
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

	public void removefirst() {
		this.head = head.next;
		size--;
	}

	public void removelast() {
		Node temp =head;
		while(temp.next!= tail) {
			temp= temp.next;
		}
		temp.next =null;
		this.tail =temp;
		size--;
	}

	public void addatk(int item, int k) {
		Node temp = head;
		for (int i = 1; i < k; i++) {
			temp = temp.next;
		}
		Node nn = new Node();
		nn.data =item;
		Node temp2 = temp.next;
		temp.next = nn;
		nn.next =temp2;
		size++;
	}
	
	public int getfirst() {
		return this.head.data;
	}
	public int getlast() {
		return this.tail.data;
	}
	
	public int getK(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public void removeatk(int k ) {
		Node temp = head;
		if(k ==0) {
			removefirst();
		}
		for (int i = 1; i < k-1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	
}
