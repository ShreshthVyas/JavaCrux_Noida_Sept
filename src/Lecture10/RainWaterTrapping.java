package Lecture10;

public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leetcode 42
		int arr[] = {4,2,0,3,2,5};
		int left[] =  new int[arr.length];
		int right[] =  new int[arr.length];
		
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
//			System.out.print(left[i] + " ");
		}
		right[right.length-1] =  arr[arr.length-1];
		for(int i =arr.length-2;i>= 0;i--) {
			right[i] =  Math.max(right[i+1],arr[i]);
//			System.out.print(right[i] + " ");
		}
		int sum =0;
		for (int i = 0; i < right.length; i++) {
			sum+=  Math.min(left[i], right[i]) - arr[i]; 
		}
		
		System.out.println(sum);
		
		

	}

}
