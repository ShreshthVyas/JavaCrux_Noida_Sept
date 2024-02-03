package Lecture40;

import java.util.HashSet;

public class graph_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addedge(1, 2, 7);
		g.addedge(1, 3, 15);
		g.addedge(2, 4, 13);
		g.addedge(2, 5, 8);
		g.addedge(3, 4, 14);
		g.addedge(5, 6, 11);
		g.addedge(5, 7, 9);
		g.addedge(6, 7, 10);
//		g.display();
//		g.removeedge(1, 2);
//		g.removevertice(7);
//		g.display();
//		System.out.println(g.containsedge(3, 4));
//		System.out.println(g.containsedge(1, 2));
//		System.out.println(g.containsvertice(7));
//		System.out.println(g.containsvertice(6));
//		System.out.println(g.haspath(1, 7 , new HashSet<>()));
//		g.printallpath(1, 7 , new HashSet<>(),"");
		System.out.println(g.bfs(1, 8, new HashSet<>()));
		System.out.println(g.dfs(1, 7, new HashSet<>()));
	}

}
