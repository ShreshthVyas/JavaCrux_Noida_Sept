package Lecture42;

import java.util.*;

public class BellManFord {
	HashMap<Integer, HashMap<Integer, Integer>> graph;

	public BellManFord(int v) {
		graph = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}
	public void addedge(int v1, int v2, int cost) {
		graph.get(v1).put(v2, cost);
	}
	
	public class Edgepair{
		int e1;
		int e2;
		int cost;
		public Edgepair(int e1,int e2, int cost) {
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}
	}
	
	public void bmf() {
		int v = graph.size();
		int arr[] = new int[v+1];
		
		for (int i = 2; i <=v; i++) {
			arr[i] = 10000001;
		}
		List<Edgepair> ll = getEdgepair();
		
		for (int i = 1; i <= v; i++) {
			for (Edgepair e : ll) {
				if(i==v && arr[e.e2]>arr[e.e1]+e.cost) {
					System.out.println("-ve cycle");
					return;
				}
				if(arr[e.e2]>arr[e.e1]+e.cost) {
					arr[e.e2] = arr[e.e1]+e.cost;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	private List<Edgepair> getEdgepair() {
		// TODO Auto-generated method stub
		List<Edgepair> ll = new ArrayList<Edgepair>();
		for (int a : graph.keySet()) {
			for (int b: graph.get(a).keySet()) {
				ll.add(new Edgepair(a,b,graph.get(a).get(b)));
			}
		}
		return ll;
	}
	
	public static void main(String[] args) {
		BellManFord g = new BellManFord(7);
//		g.addedge(1, 2, 7);
//		g.addedge(1, 3, -5);
//		g.addedge(2, 4, -3);
//		g.addedge(2, 5, 8);
//		g.addedge(3, 4, -4);
//		g.addedge(5, 6, -1);
//		g.addedge(5, 7, 9);
//		g.addedge(6, 7, 10);
		g.addedge(1, 2, 2);
		g.addedge(2, 3, -1);
		g.addedge(3, 4, -3);
		g.addedge(4, 2, 3);
		g.bmf();
	}
	
	
	
	
}
