package Lecture20;

public class GenerateParanthesis {
	public static void main(String[] args) {
		int n  =2;
		para(0,0,n,"");
	}

	public static void para(int op, int cl, int n, String ans) {
		// TODO Auto-generated method stub
		if(op == n && cl==n) {
			System.out.println(ans);
			return;
		}
		if(op>n || cl>n) {
			return;
		}
		para(op+1,cl,n,ans+"(");
		if(op>cl) {
		para(op,cl+1,n,ans+")");
		}
//		para(op,cl+1,n,ans+")");
		
	}
	
}
