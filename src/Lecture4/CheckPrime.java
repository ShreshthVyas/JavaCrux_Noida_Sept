package Lecture4;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count =0;
		int i =2;
		while(i<n){
			if(n%i==0){
				count++;
			}
			i++;
		}
		if(count>0) {
			System.out.println(count);
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
	}

}
