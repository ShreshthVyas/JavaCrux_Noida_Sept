package Lecture42;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


public class Prims {
	HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Prims(int v) {
		graph = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void addedge(int v1, int v2, int cost) {
		graph.get(v1).put(v2, cost);
		graph.get(v2).put(v1, cost);
	}
	public class Primspair{
		int vtx;
		int acqvtx;
		int cost;
		public Primspair(int v, int acv,int c){
			vtx =v;
			acqvtx = acv;
			cost= c;
			
		}
	}
	public void PrimssAlgo(){
		PriorityQueue<Primspair> q = new PriorityQueue<>(new Comparator<Primspair>() {

			@Override
			public int compare(Primspair o1, Primspair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		HashSet<Integer> visited = new HashSet<>();
		int primscost =0;
		for (int src : graph.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(new Primspair(src,src,0));
			while (!q.isEmpty()) {
				Primspair rv = q.remove();// remove
				if (visited.contains(rv.vtx)) {// check
					continue;
				}
				visited.add(rv.vtx);
				primscost+= rv.cost;
				
				for (int nbrs : graph.get(rv.vtx).keySet()) {
					if (!visited.contains(nbrs)) {
						int cost = graph.get(rv.vtx).get(nbrs);
						q.add(new Primspair(nbrs,rv.vtx, cost));	
					}
				}
			}
		}
		System.out.println(primscost);
	}
	public static void main(String[] args) {
		Prims g=  new Prims(7);
		g.addedge(1, 2, 7);
		g.addedge(1, 3, 15);
		g.addedge(2, 4, 13);
		g.addedge(2, 5, 8);
		g.addedge(3, 4, 14);
		g.addedge(5, 6, 11);
		g.addedge(5, 7, 9);
		g.addedge(6, 7, 10);
		
		g.PrimssAlgo();
		
	}

}
