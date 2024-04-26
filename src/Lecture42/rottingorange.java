package Lecture42;

import java.util.LinkedList;
import java.util.Queue;

public class rottingorange {
	public class pair{
        int row;
        int col;
        int tm;
        public pair(int r, int c, int t){
            this.row =r;
            this.col=c;
            this.tm= t;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<pair> q =  new LinkedList<>();
        int visited[][] = new int[grid.length][grid[0].length];
        int cntfresh=0;
        for(int i= 0; i<grid.length;i++){
            for(int j=0; j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j,0));
                    visited[i][j]=2;
                }
                else if(grid[i][j]==1){
                    cntfresh++;
                }
            }
        }
        int ans=0;
        int count =0;
        int rowidx[]= {0,1,0,-1};
        int colidx[]= {1,0,-1,0};
        while(!q.isEmpty()){
            
            pair p = q.poll();
            ans = Math.max(ans,p.tm);
            for(int i =0; i<4;i++){
                int currow= p.row + rowidx[i];
                int curcol= p.col + colidx[i];
                if(currow>=0 && currow<grid.length&&curcol>=0 && curcol<grid[0].length&& grid[currow][curcol]==1&&visited[currow][curcol]==0){
                    // System.out.println(currow+" " +curcol+ " ");
                    q.add(new pair(currow,curcol,p.tm+1));
                    visited[currow][curcol]=2;
                    count++;
               }
            }
            
        }
        // System.out.println(count + " " + cntfresh);
        // System.out.println(ans);
        return count==cntfresh?ans:-1;
    }
}
