package Lecture2;

import java.util.Scanner;

public class Table_DivisibleBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int i =1;
		while(i<=10) {
			int prod =i*n;
			if(prod % m !=0) {
			System.out.print(prod + " ");
			}
			i= i+1;
		}
		
	}

}
