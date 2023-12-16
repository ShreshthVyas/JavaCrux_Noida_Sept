package Lecture28;

import java.util.Stack;

public class Insert_At_Bottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
//		System.out.println(st.peek());
//		st.pop();
		System.out.println(st);
		System.out.println("*************");
		iab(st,60);
		System.out.println(st);
		
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
