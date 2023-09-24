package Lecture7;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =0;
		int nst =1;
		
		while(row< n) {
			int val = 1;
			int cst =0;
			while(cst<nst) {
				System.out.print(val + " ");
				val = ((row-cst)* val /(cst+1)) ;
//				val++;
				cst++;
			}
			System.out.println();
			row++;
			nst++;
		}
	}

}
