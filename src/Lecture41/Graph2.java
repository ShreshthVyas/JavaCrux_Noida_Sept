package Lecture41;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph2 {
	HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Graph2(int v) {
		graph = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void addedge(int v1, int v2, int cost) {
		graph.get(v1).put(v2, cost);
		graph.get(v2).put(v1, cost);
	}

	public void bft() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int src : graph.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.remove();// remove
				if (visited.contains(rv)) {// check
					continue;
				}
				System.out.print(rv + " ");
				visited.add(rv);

				for (int nbrs : graph.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
	}
	
	public void dft() {
		Stack<Integer> q = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int src : graph.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.pop();// remove
				if (visited.contains(rv)) {// check
					continue;
				}
				System.out.print(rv + " ");
				visited.add(rv);

				for (int nbrs : graph.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
	}
	public boolean isCyclic() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int src : graph.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.remove();// remove
				if (visited.contains(rv)) {// check
					return true;
				}
//				System.out.print(rv + " ");
				visited.add(rv);

				for (int nbrs : graph.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		return false;
	}
	public boolean isConnected() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count =0;
		for (int src : graph.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			count++;
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.remove();// remove
				if (visited.contains(rv)) {// check
					continue;
				}
//				System.out.print(rv + " ");
				visited.add(rv);

				for (int nbrs : graph.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		System.out.println(count);
		return count==1;
	}
	public boolean isTree() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count =0;
		for (int src : graph.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			count++;
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.remove();// remove
				if (visited.contains(rv)) {// check
					return false;
				}
//				System.out.print(rv + " ");
				visited.add(rv);

				for (int nbrs : graph.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		return count==1;
	}
	public static void main(String[] args) {
		Graph2 g=  new Graph2(7);
		g.addedge(1, 2, 7);
		g.addedge(1, 3, 15);
//		g.addedge(2, 4, 13);
		g.addedge(2, 5, 8);
		g.addedge(3, 4, 14);
//		g.addedge(5, 6, 11);
		g.addedge(5, 7, 9);
		g.addedge(6, 7, 10);
//		System.out.println(g.isCyclic());
//		System.out.println(g.isConnected());
		System.out.println(g.isTree());
		
	}
}
