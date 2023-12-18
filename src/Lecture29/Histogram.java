package Lecture29;

import java.util.*;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s  = new Stack<>();
		int arr [] = { 2, 1, 5, 6, 2,3,3,3,3};
		
		int ans =0;
		for (int i = 0; i < arr.length; i++) {
			while(!s.isEmpty() && arr[i]<= arr[s.peek()]) {
				int h = arr[s.pop()];
				int w = i;
				if(s.isEmpty()) {
					ans =  Math.max(ans, w*h);
				}
				else {
					int l = s.peek();
					ans  =  Math.max(ans, h*(w-l-1));
				}
			}
			s.push(i);
		}
		int w = arr.length;
		
		while(!s.isEmpty()) {
			int h = arr[s.pop()];
			if(s.isEmpty()) {
				ans =  Math.max(ans, w*h);
			}
			else {
				int l = s.peek();
				ans  =  Math.max(ans, h*(w-l-1));
			}
		}
		System.out.println(ans);
		
	}

}
