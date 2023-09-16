package Lecture3;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = 2*n -3;
		int nst2 = 1;
		while(row<=n) {
			int cst = 0;
			if(row==n) {
				cst=1;
			}
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			int csp =0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst2 =0;
//			if(row==n) {
//				cst2 =1;
//			}
			
			while(cst2<nst2) {
				System.out.print("* ");
				cst2++;
			}
			System.out.println();
			row++;
			nst++;
			nsp-=2;
			nst2++;
			
		}
		
	}

}
