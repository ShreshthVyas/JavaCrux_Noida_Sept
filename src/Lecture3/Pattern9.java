package Lecture3;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int nsp = 0;
		int nst = n;
		int row =1;
		while(row<= 2*n-1) {
			int csp =0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst =0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			if(row<n) {
				nsp+=2;
				nst--;
			}
			else {
				nsp-=2;
				nst++;
			}
			row++;
			
		}
	}

}
