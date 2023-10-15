package Lecture13;

public class TimeComplexity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		int n =10000;
		int i =1;
		int k=10;
		while(i<n) {
			System.out.println("Hello World");
			// O(n)
			i++;
		}
		while(i<=n) {
			System.out.println("Hello World");
			//O(log n)
			i*=2;
		}
		while(n>0) {
			System.out.println("Hello World");
			//O(log n)
			n=n/2;
		}
		while(i<=n) {
			System.out.println("Hello World");
			//Olog(n) base 6
			i*=2;
			i*=3;
		}
		while(i<=n) {
			System.out.println("Hello World");
			// O(n)
			i+=2;
			i+=3;
		}
		while(n>0) {
			System.out.println("Hello World");
			//O(log n) base 6
			n=n/2;
			n= n/3;
		}
		
		while(i<=n) {
			System.out.println("Hello World");
			// O (log n) base k
			i*=k;
			
		}
		while(i<=n) {
			System.out.println("Hello World");
			//O(N/k);
			i+=k;
			
		}
		while(n>0) {
			System.out.println("Hello World");
			//O(n)
			n=n-1;
		}
		while(n>0) {
			System.out.println("Hello World");
			//O(n)
			n=n-1;
			n=n-2;
		}
		while(n>0) {
			System.out.println("Hello World");
			//O(n/k)
			n=n-k;
		}
		for (int i = 0; i <=n ; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("Hey");
				// O(n^2)
			}
			
		}
		for (int i = 0; i <=n ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println("Hey");
			}
			//O(n^2)
		}
		for (int i = 0; i*i <=n ; i++) {
				//O(sqrt n)
				System.out.println("Hey");
			
		}
		
		for (int i = 0; i <=n ; i++) {
			for (int j = 1; j <= i*i; j++) {
				for (int k = 0; k <=n/2; k++) {
					//O(n^4)
					System.out.println("Hey");
				}
			}
		}
		
		for (int j = 1; j <=n ; j++) {
			// O(Sqrt(n))
			System.out.println();
			j*=j;
		}
		for (int i = n/2; i <=n ; i++) {
			for (int j = 1; j <= n/2; j++) {
				for (int k = 1; k <=n/2; k*=2) {
					System.out.println("Hey");
					//O(n^2 log(n))
				}
			}
		}
		for (int j = 1; j <=n ; j++) {
			for (int k = 1; k <= n; k+=j) {
				System.out.println("Hey");
				
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
