package Lecture3;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int row = 1;
		int nsp = n-1;
		int nst =1;
		while(row<=n) {
			int csp =0;
			while(csp<nsp) {
				System.out.print( "  ");
				csp++;
			}
			int cst = 0;
			while(cst<nst) {
				if(cst %2 == 0) {
					System.out.print("* ");
				}
				else {
					System.out.print("! ");
				}
				
				cst++;
			}
			System.out.println();
			nsp--;
			nst+=2; // nst = nst + 2
			row++;
			
			
		}
		
	}

}
