package Lecture46;

public class Unique_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,2,3,5,7,7};
		int ans =0;
		
		for (int i = 0; i < arr.length; i++) {
			ans = ans^arr[i];
		}
		
		System.out.println(ans);
	}

}
