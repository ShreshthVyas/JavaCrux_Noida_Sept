package Lecture17;

import java.util.ArrayList;
import java.util.Collections;

public class SumofNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] =  {9,9,9,9,9,1};
		int a[] = {7,8};
		ArrayList<Integer>  list  = new ArrayList<>();
		int carry =0;
//		int sum = 0;
		int i = a.length-1;
		int j = b.length-1;
		while(i>=0 && j>=0) {
			
			int sum =  a[i] + b[j] + carry;
			list.add(sum%10);
			
			carry = sum/10;
			i--;
			j--;
		}
		if(a.length>b.length) {
			while(i>=0) {
			int sum = a[i] + carry;
			list.add(sum%10);
			carry = sum/10;
			i--;
			}	
		}
		else {
			while(j>=0) {
				int sum = b[j] + carry;
				list.add(sum%10);
				carry = sum/10;
				j--;
			}
		}
		
		if(carry>0) {
			list.add(carry);
		}
		Collections.reverse(list);
		System.out.println(list);
		
		
		
	}

}
