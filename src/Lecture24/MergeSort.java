package Lecture24;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,1,100,3};
		int ans[] = mergesort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] mergesort(int arr[], int i, int j) {
		if(i==j) {
			int temp[] =new int[1];
			temp[0] = arr[i];
			return temp;
		}
		int mid = (i+j) / 2;
		int fh[] = mergesort(arr, i,mid);
		int sh[] = mergesort(arr, mid+1,j);
		return merge2sortedarr(fh,sh);
	}
	public static int[] merge2sortedarr(int a[], int b[]) {
		int ans [] = new int[a.length+b.length];
		int i =0;
		int j =0;
		int k =0;
		while(i<a.length&& j<b.length) {
			if(a[i]<b[j]) {
				ans[k] = a[i];
				i++;
			}
			else {
				ans[k] = b[j];
				j++;
			}
			k++;
		}
		while(i<a.length) {
			ans[k] = a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			ans[k] = b[j];
			j++;
			k++;
		}
		return ans;
	}
}
