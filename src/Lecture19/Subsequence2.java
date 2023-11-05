package Lecture19;

public class Subsequence2 {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		subseq(s,"");
		System.out.println(count);
		
	}
	public static void subseq(String ques, String ans) {
		if(ques.length() ==0) {
			count++;
			return;
		}
		char ch = ques.charAt(0);
		subseq(ques.substring(1), ans);
		subseq(ques.substring(1),ans + ch);
	}
	}
	


