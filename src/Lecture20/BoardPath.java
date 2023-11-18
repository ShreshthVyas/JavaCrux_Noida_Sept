package Lecture20;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		boardpath2(0,n,"");
	}

	public static void boardpath(int curr , int n, String ans) {
		// TODO Auto-generated method stub
		if(curr == n) {
			System.out.println(ans);
			return;
		}
		if(curr>n) {
			return;
		}
		
		boardpath(curr+1,n ,ans+1); // call 1
		boardpath(curr+2,n ,ans+2); // call 2
		boardpath(curr+3,n ,ans+3); // call 3
	}
	
	public static void boardpath2(int curr , int n, String ans) {
		// TODO Auto-generated method stub
		if(curr == n) {
			System.out.println(ans);
			return;
		}
		if(curr>n) {
			return;
		}
		for (int i = 1; i <=n; i++) {
			boardpath2(curr+i,n,ans+i);
		}
	}

}
