package Lecture9;

import java.util.Scanner;

public class Array_Max {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int c = max(arr);
		int d = max2(arr);
		System.out.println(c + " " + d);
	}
	public static int max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int max2(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
			max = Math.max(arr[i],max);
		}
		return max;
	}


	
	

}
