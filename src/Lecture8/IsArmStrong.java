package Lecture8;

import java.util.Scanner;

public class IsArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int nod = no_of_digit(n);

		int sum_dig = sum_of_digit(n,nod);
		if(sum_dig == n) {
			System.out.println("Is an ArmStrong Number");
		}
		else {
			System.out.println("Is not an ArmStrong Number");
		}
		
	}
	public static int no_of_digit(int m) {
		int count  =0;
		while(m>0) {
			m/=10;//m= m/10
			count++;
		}
		return count;
	}
	public static int sum_of_digit(int m , int nod) {
		int sum =0;
		while(m>0) {
			int rem = m%10;
			sum  = sum  + (int) Math.pow(rem, nod);
			m/=10;
		}
		return sum;
	}

}
