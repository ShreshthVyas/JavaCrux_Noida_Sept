package Lecture9;

import java.util.Scanner;

public class Array_Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		swap(arr,1,4);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void swap(int arr[] , int i , int j) {
		int temp =  arr[i];
		arr[i]= arr[j];
		arr[j] = temp;
	}
	

}
