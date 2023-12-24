package Lecture31;

public class LinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addfirst(1);
		ll.addfirst(2);
		ll.addLast(10);
		ll.addLast(3);
		ll.addLast(4);
//		ll.Display();
		ll.addatk(11, 2);
//		ll.removelast();
		ll.Display();
		ll.removeatk(0);
//		System.out.println(ll.getsize());
		ll.Display();
		
	}

}
