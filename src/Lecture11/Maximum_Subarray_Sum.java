package Lecture11;

public class Maximum_Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,-4,-1,-7,-8};
		int ans =  Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			ans = Math.max(ans, sum);
			for (int j = i+1; j < arr.length; j++) {
				sum+= arr[j];
				ans = Math.max(ans, sum);
			}
		}
		System.out.println(ans);
	}

}
