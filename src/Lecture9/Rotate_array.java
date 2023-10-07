package Lecture9;

public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leetcode 189
		int arr[] = {-1,-100,3,99};
		int k = 2;
		k = k%arr.length;
		rev(arr,0,arr.length-1);
		rev(arr,0,k-1);
		rev(arr,k,arr.length-1);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void rev(int arr[], int i, int j) {
		while(i<=j) {
			int temp = arr[i];
			arr[i] =arr[j];
			arr[j] =temp;
			i++;
			j--;
		}
	}

}
