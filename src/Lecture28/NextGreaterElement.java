package Lecture28;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {1,2,3,4};
		
		Stack<Integer>  st =  new Stack<>();
		nextgreater(arr, st);
		
		
	}
	public static void nextgreater(int arr[], Stack<Integer>  s) {
		int nge[] =  new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			while(!s.isEmpty()&& arr[i]>arr[s.peek()]) {
				nge[s.pop()] = arr[i];
			}
			s.push(i);	
		}
		while(!s.isEmpty()) {
			nge[s.pop()] = -1;
		}
		
		for (int i = 0; i < nge.length; i++) {
			System.out.println(arr[i] + " , " + nge[i]);
		}
	}

}
