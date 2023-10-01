package Lecture9;

import java.util.Scanner;

public class Array_swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,6,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		swap(2,6);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void swap(int i , int j) {
		int temp =  i;
		i= j;
		j = temp;
	}

}
