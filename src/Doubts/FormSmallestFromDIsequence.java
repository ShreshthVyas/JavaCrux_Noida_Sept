package Doubts;

import java.util.*;

public class FormSmallestFromDIsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			int count = 1;
			int[] ans = new int[str.length() + 1];
			int j =0;
			Stack<Integer>  st = new Stack<>();
			for (int i = 0; i < str.length(); i++) {
				char ch= str.charAt(i);
				if(ch == 'D') {
					st.push(count);
					count++;
				}
				else {
					st.push(count);
					count++;
					
					while(!st.isEmpty()) {
						ans[j] = st.pop();
						j++;
					}
				}
			}
			st.push(count);
			while(!st.isEmpty()) {
				ans[j] = st.pop();
				j++;
			}
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i]);
			}

			System.out.println();
		}
	}

}
