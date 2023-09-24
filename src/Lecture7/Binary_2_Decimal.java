package Lecture7;

import java.util.Scanner;

public class Binary_2_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int ans  =0;
		int mul= 1;
		while(n>0) {
			int rem  = n%10;
			ans  = ans + rem*mul;
			n =n/10;
			mul = mul*2;
		}
		System.out.println(ans);
	}

}
