package Lecture10;

public class product_of_arr_except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leetcode 238
		int arr [] = {1,2,3,4};
		
		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i]= left[i-1] * arr[i-1];
//			System.out.print(left[i] + " " );
		}
		right[right.length-1] = 1;
		for (int i = right.length-2; i>=0; i--) {
			right[i] = right[i+1] * arr[i+1];
//			System.out.print(right[i] + " " );
		}
		
		for (int i = 0; i < right.length; i++) {
			arr[i] =  left[i]*right[i];
		}
		for (int i = 0; i < right.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		
		
		
		
	}

}
