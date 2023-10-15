package Lecture12;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = { 1,2,3,4,5,7,10,12};
		int target = 9;
		System.out.println(binarySearch(arr, target));
		
	}
	public static int binarySearch(int arr[], int target) {
		int i = 0;
		int j = arr.length-1;
		while(i<=j) {
			int mid = (i+j)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if (arr[mid]>target) {
				j =  mid-1;
			}
			else {
				i = mid+1;
			}
		}
		return -1;
	}

}
