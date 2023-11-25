package Lecture22;

import java.util.Scanner;

public class RateChasesCheese {
	static boolean flag  =false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
//		char ch = sc.next().charAt(0);
		char[][] maze =  new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < maze[i].length; j++) {
				maze [i][j] = s.charAt(j);
			}
		}
		int ans [][] = new int[n][m];
		
		ratcheese(0,0,n,m,ans , maze);
		if(!flag) {
			System.out.println("NO PATH FOUND");
		}
//		
	}

	public static void ratcheese(int cr, int cc, int n,int m,int ans [][],char[][] maze  ) {
		// TODO Auto-generated method stub
		if(cr == n-1 && cc ==m-1 && maze[cr][cc] != 'X') {
			flag =true;
			ans[cr][cc] = 1;
			Display(ans);
			return;
		}
		if(cr>=n || cc>=m || cr<0||cc<0|| maze[cr][cc] == 'X') {
			return;
		}
		ans[cr][cc] = 1;
		maze [cr][cc] = 'X';
		ratcheese(cr+1,cc,n,m,ans,maze);
		ratcheese(cr,cc+1,n,m,ans,maze);
		ratcheese(cr-1,cc,n,m,ans,maze);
		ratcheese(cr,cc-1,n,m,ans,maze);
		ans[cr][cc] = 0;
		maze [cr][cc] = 'O';
		
		
//		
		
	}
	public static void Display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	}


