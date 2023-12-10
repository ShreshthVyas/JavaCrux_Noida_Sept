package Lecture27;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		q.Enqueue(1);
		q.Enqueue(2);
		System.out.println(q.Dequeue());
		q.Enqueue(3);
		q.Enqueue(4);
		q.Enqueue(5);
		q.Enqueue(6);
		System.out.println(q.isFull());
		q.Display();
		
	}

}
