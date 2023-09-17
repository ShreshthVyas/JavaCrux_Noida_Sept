package Lecture4;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 27
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
//		int val =1;
		while (row <= n) {
			int val = 1;
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;

			while (cst < nst) {
				System.out.print(val + " ");
				if (cst >= nst / 2) {
					val--;
				}
				else {
					val++;
				}
				cst++;
			}
			System.out.println();
			nsp--;
			nst += 2;
			row++;
		}
	}

}
