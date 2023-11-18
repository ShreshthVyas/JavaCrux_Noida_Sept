package Lecture20;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "abc";
		permutation(q,"");
	}

	public static void permutation(String q, String ans) {
		// TODO Auto-generated method stub
		if(q.length() ==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < q.length(); i++) {
			char ch = q.charAt(i);
			String s1 = q.substring(0,i);
			String s2 = q.substring(i+1);
			permutation(s1+s2, ans+ ch);
		}
		
	}


}
