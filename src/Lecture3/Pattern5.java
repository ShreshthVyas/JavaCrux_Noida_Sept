package Lecture3;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = n;
		int nsp = n-2;
		while(row<=n) {
			if(row==1 || row ==n) {
				int cst = 0;
				while(cst<nst) {
					System.out.print("* ");
					cst = cst+1;
				}
			}
			else {
				System.out.print("* ");
				int csp = 0;
				while(csp<nsp) {
					System.out.print("  ");
					csp = csp +1;
				}
				System.out.print("* ");
			}
			System.out.println();
			row = row+1;
			
		}
	
	}

}
