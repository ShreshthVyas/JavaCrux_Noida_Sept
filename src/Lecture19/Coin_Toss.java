package Lecture19;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =4;
		coin(n,"");
	}
	public static void coin(int n , String ans) {
		if(n == 0) {
			System.out.println(ans);
			return;
		}
		
		coin(n-1, ans+"H");
		
		coin(n-1 , ans+ "T");
	}

}
