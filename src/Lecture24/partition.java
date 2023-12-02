package Lecture24;

import java.util.Arrays;

public class partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,1,5,3,2,4};
		int ans = partition(a, 0,a.length-1);
		System.out.println(ans);
		System.out.println(Arrays.toString(a));
	}
	public static int partition(int arr[], int si, int ei) {
		int item =arr[ei];
		int idx = si;
		for (int i = si;i < ei; i++) {
			if(arr[i]<item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		
		return idx;
	}

}
