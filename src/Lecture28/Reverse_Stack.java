package Lecture28;

import java.util.Stack;

public class Reverse_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>  s =  new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		reverse(s);
		System.out.println(s);
		
	}

	private static void reverse(Stack<Integer> s) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			return;
		}
		int x = s.pop();
		reverse(s);
		iab(s,x);
		
	}
	public static void iab(Stack <Integer> s, int item) {
		if(s.isEmpty()) {
			s.push(item);
			return;
		}
		int x = s.pop();
		iab(s,item);
		s.push(x);
	}
	

}
