package Lecture41;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Djikstra {
	HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Djikstra(int v) {
		graph = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void addedge(int v1, int v2, int cost) {
		graph.get(v1).put(v2, cost);
		graph.get(v2).put(v1, cost);
	}
	
	public class dpair{
		int vtx;
		int cost;
		String path;
		
		public dpair(int v, int c, String p){
			vtx =v;
			cost = c;
			path = p;
		}
		
		@Override
		public String toString() {
			return vtx + " via " + path + " @ cost = " + cost;
		}
	}
	
	public void DjikstraAlgo(){
		PriorityQueue<dpair> q = new PriorityQueue<>(new Comparator<dpair>() {

			@Override
			public int compare(dpair o1, dpair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		HashSet<Integer> visited = new HashSet<>();
		
		for (int src : graph.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(new dpair(src, 0, ""+src));
			while (!q.isEmpty()) {
				dpair rv = q.remove();// remove
				if (visited.contains(rv.vtx)) {// check
					continue;
				}
				System.out.println(rv);
				visited.add(rv.vtx);

				for (int nbrs : graph.get(rv.vtx).keySet()) {
					if (!visited.contains(nbrs)) {
						int cost = graph.get(rv.vtx).get(nbrs)+ rv.cost;
						q.add(new dpair(nbrs, cost, rv.path+" "+ nbrs));
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Djikstra g=  new Djikstra(7);
		g.addedge(1, 2, 7);
		g.addedge(1, 3, 15);
		g.addedge(2, 4, 13);
		g.addedge(2, 5, 8);
		g.addedge(3, 4, 14);
		g.addedge(5, 6, 11);
		g.addedge(5, 7, 9);
		g.addedge(6, 7, 10);
		
		g.DjikstraAlgo();
		
	}
	
}
