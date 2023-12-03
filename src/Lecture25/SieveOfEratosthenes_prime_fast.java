package Lecture25;

public class SieveOfEratosthenes_prime_fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =50;
		soe(n);
		
	}
	public static void soe(int n) {
		boolean arr[] =  new boolean[n+1];
		arr[0] = true;
		arr[1] = true;
		
		for (int i = 2; i*i<=n; i++) {
			if(arr[i]==false) {
				for (int j = 2; j*i < arr.length; j++) {
					arr[i*j] = true;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i]) {
				System.out.print(i + " ");
			}
		}
	}

}
