package Lecture4;

import java.util.Scanner;

public class Break_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		boolean check = false;
		int i =2;
		while(i<n){
			if(n%i==0){
				check =true;
				break;
			}
			i++;
		}
		if(check == true) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
				
		
	}

}
