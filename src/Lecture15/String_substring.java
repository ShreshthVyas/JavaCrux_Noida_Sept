package Lecture15;

public class String_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HelloBye";
		for (int i = 0; i <= s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				System.out.print(s.substring(i,j) + " ");
			}
			System.out.println();
		}
	}

}
