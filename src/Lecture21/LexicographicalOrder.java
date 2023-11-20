package Lecture21;

public class LexicographicalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1000;
		lexco(0,n);
	}

	public static void lexco(int curr, int n) {
		// TODO Auto-generated method stub
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if(curr == 0) {
			i=1;
		}
		for (; i <=9; i++) {
			lexco(curr*10+i,n);
		}
	}

}
