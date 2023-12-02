package Lecture24;

import java.util.Arrays;

public class Mergetwosortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = {0,2,7};
		int a [] = {8,300,600};
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
		System.out.println(Arrays.toString(ans));
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
		
		System.out.println(Arrays.toString(ans));
	}

}
