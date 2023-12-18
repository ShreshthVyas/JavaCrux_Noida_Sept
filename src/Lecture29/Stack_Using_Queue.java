package Lecture29;
import java.util.Stack;

import Lecture27.Queue;
public class Stack_Using_Queue {
	private Queue q;
	
	public Stack_Using_Queue() {
		q = new Queue();
	}
	public void push(int item) throws Exception {
		q.Enqueue(item);
	}
	
	public int pop() throws Exception {
		Queue temp = new Queue();
		while(q.size()>1) {
			temp.Enqueue(q.Dequeue());
		}
		int x = q.Dequeue();
		while(!temp.isEmpty()) {
			q.Enqueue(temp.Dequeue());
		}
		return x;
	}
	
	

}
