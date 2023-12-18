package Lecture29;

import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>  st = new Stack<>();
		boolean flag =true;
		int arr [] [] = {{0, 0, 1, 0},
			{0, 0, 1, 0},
			{0, 0, 0, 2},
			{0, 0, 1, 0}};
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		while(st.size()>1) {
			int a = st.pop();
			int b = st.pop();
			if(arr[a][b] ==1) {
				st.push(b);
			}
			else {
				st.push(a);
			}
		}
		int c = st.pop();
		for (int i = 0; i < arr.length; i++) {
			if(i==c) {
				continue;
			}
			if(arr[i][c] == 0 || arr[c][i]==1) {
				System.out.println("NO CELEBRITY");
				flag =false;
				break;
			}
			
		}
		if(flag) {
		System.out.println(c);
		}
	}

}
