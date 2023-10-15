package Lecture13;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int nos = sc.nextInt();
			int noc = sc.nextInt();
			int arr[] = new int[nos];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(mindist(arr,noc));
		}
		
	}
	
	public static int mindist(int arr[], int noc) {
		int i = arr[0];
		int j = arr[arr.length-1];
		int ans = 0;
		while(i<=j) {
			int mid = (i+j)/2;
			if(isitpossible(arr, mid, noc)) {
				ans = mid;
				i =  mid+1;
			}
			else {
				j = mid-1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] arr, int mid, int noc) {
		// TODO Auto-generated method stub
		int nocp = 1;
		int pos = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]- arr[pos]>=mid) {
				nocp++;
				pos =i;
			}
			if(nocp == noc) {
				return true;
			}
		}
		return false;
	}

}
