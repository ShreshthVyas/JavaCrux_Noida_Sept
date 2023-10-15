package Lecture12;

public class Kthroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 128;
		int k =3;
		System.out.println(kthroot(n, k));;
	}
	public static int kthroot(int n , int k ) {
		int i =1;
		 int j = n;
		 int ans =0;
		 while(i<=j) {
			 int mid  = (i+j)/2;
			 if(Math.pow(mid,k)<= n) {
				 ans = mid;
				 i = mid+1;
				 
			 }
			 else {
				 j = mid-1;
			 }
		 }
		 return ans;
	}

}
