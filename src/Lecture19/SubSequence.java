package Lecture19;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		subseq(s,"");
		
	}
	public static void subseq(String ques, String ans) {
		if(ques.length() ==0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		subseq(ques.substring(1), ans);
		subseq(ques.substring(1),ans + ch);
	}

}
