package Lecture37;

import java.util.Arrays;


public class Generic_Demo {
	public static void main(String[] args) {
		Integer nums[] = {1,2,3,4,5};
		display(nums);
		String arr1[] = {"H", "k", "l" , "i"};
		display(arr1);
		
		
	}
	
	public static <T>void display(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
}
