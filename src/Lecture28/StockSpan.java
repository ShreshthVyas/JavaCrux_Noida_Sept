package Lecture28;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {30,35,40, 38, 35};
		Stack<Integer> s  = new Stack<>();
		int ans[] = new int[arr.length];
		
		for (int i = 0; i < ans.length; i++) {
			while(!s.isEmpty() && arr[i] >= arr[s.peek()]) {
				s.pop();
			}
			if(s.isEmpty()) {
				ans[i] =  i+1;
			}
			else {
				ans[i] = i - s.peek();
			}
			s.push(i);
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
