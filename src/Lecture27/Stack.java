package Lecture27;

public class Stack {
	private int arr[];
	int size;
	private int top = -1;
	
	public Stack() {
		arr = new int[5];
	}
	public Stack(int n) {
		arr = new int[n];
	}

	public boolean isFull() {
		return top == arr.length-1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(int item)throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full");
		}
		top++;
		arr[top] = item;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int temp = arr[top];
		top--;
		return temp;
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[top];
	}
	
	public void Display() {
		for (int i = 0; i <=top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	
}
