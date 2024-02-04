package Lecture41;

import java.util.*;

public class Bipartite {
	// [[1,2,3],[0,2],[0,1,3],[0,2]]
	public   boolean isBipartite(int[][] graph) {
		HashMap<Integer,HashSet<Integer>> map  = new HashMap<>();
		for (int i = 0; i < graph.length; i++) {
			map.put(i, new HashSet<>());
		}
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				map.get(i).add(graph[i][j]);
			}
		}
		return isbipart(map);
	}
	public class bipair{
		int vtx;
		int d;
		
		public bipair(int v, int dis) {
			vtx =v;
			d= dis;
		}
	}
	public boolean isbipart(HashMap<Integer,HashSet<Integer>> graph) {
		Queue<bipair> q = new LinkedList<>();
		HashMap<Integer, Integer>  visited = new HashMap<>();
		
		for (int src : graph.keySet()) {
			if (visited.containsKey(src)) {
				continue;
			}
			
			q.add(new bipair(src, 0));
			while (!q.isEmpty()) {
				bipair rv = q.remove();// remove
				if (visited.containsKey(rv.vtx)) {
					if(visited.get(rv.vtx) != rv.d) {
						return false;
					}
					continue; //kuch kaam
				}
				
				visited.put(rv.vtx, rv.d);

				for (int nbrs : graph.get(rv.vtx)) {
					if (!visited.containsKey(nbrs)) {
						q.add(new bipair(nbrs, rv.d+1));
					}
				}
			}
		}
		return true;
	}
}
