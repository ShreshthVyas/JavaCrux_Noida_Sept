package Doubts;

import java.util.Scanner;

public class MurthalParantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			int paratha=sc.nextInt();
			int n = sc.nextInt();
			
		       int[] chefs= new int[n];
		       for (int i = 0; i < chefs.length; i++) {
				chefs[i] = sc.nextInt();
			}
		      // minimum_time(chefs, paratha);
		       System.out.println(minimum_time(chefs, paratha));
		       
			}
			
			public static int minimum_time(int[] chefs,int no_of_paratha ) {
				int lo=0;
				int hi=0;
				int ans=0;
				for (int i =1; i <= no_of_paratha; i++) {
					hi+=chefs[chefs.length-1]*i;
				}
				while(lo<=hi) {
					int mid=(lo+hi)/2;
					if(is_it_possible(chefs,mid,no_of_paratha)) {
						ans=mid;
						hi=mid-1;
					}else {
						lo=mid+1;
					}
				}
				return ans;
	            }
				public  static boolean is_it_possible(int[] chefs, int mid, int no_of_paratha) {
				int paratha=0;
				int initial_time=0;
				int i=0;
				int x=1;
				while(i<chefs.length) {
					if(x*chefs[i]+initial_time<=mid) {
						initial_time+=x*chefs[i];
						
						paratha++;
						x++;
						
					}else {
						i++;
						initial_time=0;
						x=1;
					}
					if(paratha==no_of_paratha) {
						return true;
					}
				}
			
				return false;
	}

}
