package Lecture25;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,3,2,9,7,8,4};
		quicksort(arr, 0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void quicksort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>=ei) {
			return;
		}
		int pivot = partition(arr, si, ei);
		quicksort(arr, si, pivot-1);
		quicksort(arr, pivot+1, ei);
	}
	public static int partition(int arr[], int si, int ei) {
		int item =arr[ei];
		int pivot = si;
		for (int i = si;i < ei; i++) {
			if(arr[i]<item) {
				int temp = arr[i];
				arr[i] = arr[pivot];
				arr[pivot] = temp;
				pivot++;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[pivot];
		arr[pivot] = temp;
		return pivot;
	}

}
