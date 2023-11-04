package Lecture18;

public class Linear_search_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,4,12,7,9};
		System.out.println(search(arr,12,0));
	}
	public static int search(int arr[], int target , int i) {
		if(i == arr.length) {
			return -1;
		}
		
		if(arr[i] == target) {
			return i;
		}
		
		return search(arr,target,i+1);
	}

}
