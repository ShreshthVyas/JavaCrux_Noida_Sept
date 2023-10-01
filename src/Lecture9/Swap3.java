package Lecture9;

public class Swap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,6,5};
		int other[] = {5,4,6,7,8};
		System.out.println(arr[0] + " " + other[0] );
		swap(arr,other);
		System.out.println(arr[0] + " " + other[0] );	
	}
	public static void swap(int brr[] , int bother[]) {
		int temp[] = brr;
		brr = bother;
		bother = temp;
	}
}
