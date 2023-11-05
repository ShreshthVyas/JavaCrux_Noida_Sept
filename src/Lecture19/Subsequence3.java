package Lecture19;

public class Subsequence3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		System.out.println(subseq(s,""));;

		
	}
	public static int subseq(String ques, String ans) {
		if(ques.length() ==0) {
			return 1;
		}
		char ch = ques.charAt(0);
		int exc = subseq(ques.substring(1), ans);
		int inc = subseq(ques.substring(1),ans + ch);
		return inc + exc;
	}

}
