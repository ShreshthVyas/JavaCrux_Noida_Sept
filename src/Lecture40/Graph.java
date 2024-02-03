package Lecture40;
import java.util.*;

public class Graph {
	 HashMap<Integer, HashMap<Integer,Integer>> graph ;
	 
	 public Graph(int v) {
		 graph = new HashMap<>();
		 for (int i = 1; i <=v; i++) {
			graph.put(i, new HashMap<>());
		}
	 }
	 
	 public void addedge(int v1, int v2 , int cost) {
		 graph.get(v1).put(v2, cost);
		 graph.get(v2).put(v1, cost);
	 }
	 
	 public void addvertice(int v) {
		 graph.put(v, new HashMap<>());
	 }
	 
	 public void removevertice(int v) {
		 for (int i : graph.get(v).keySet()) {
			graph.get(i).remove(v);
		}
		 graph.remove(v);
	 }
	 
	 public void removeedge(int v1, int v2) {
		 graph.get(v1).remove(v2);
		 graph.get(v2).remove(v1);
	 }
	 public boolean containsvertice(int v) {
		 return graph.containsKey(v);
	 }
	 
	 public boolean containsedge(int v1, int v2) {
		 return graph.get(v1).containsKey(v2);
	 }
	 
	 public int countedge() {
		 int count =0;
		 for (int i : graph.keySet()) {
			count += graph.get(i).size();
		}
		 return count/2;
	 }
	 
	 public void display() {
		 for (int i : graph.keySet()) {
				System.out.println(i + " : " + graph.get(i));
			}
	 }
	 
	 public boolean haspath(int src,int dest , HashSet<Integer> visited) {
		 if(src == dest) {
			 return true;
		 }
		 visited.add(src);
		 for (int nbrs : graph.get(src).keySet()) { // nbrs =padosi
			 if(!visited.contains(nbrs)) {
				 boolean ans = haspath(nbrs,dest,visited);
				 if(ans) {
					 return ans;
				 }
			 }
		}
		 visited.remove(src);
		 return false;
	 }
	 
	 public void printallpath(int src,int dest , HashSet<Integer> visited , String ans) {
		 if(src == dest) {
			 System.out.println(ans + dest);
			 return ;
		 }
		 visited.add(src);
		 for (int nbrs : graph.get(src).keySet()) { // nbrs =padosi
			 if(!visited.contains(nbrs)) {
				 printallpath(nbrs,dest,visited , ans+ src +"=>");
			 }
		}
		 visited.remove(src);
	 }
	 
	 public boolean bfs(int src , int dest , HashSet<Integer>  visited) {
		 if(src == dest) {
			 return true;
		 }
		 Queue<Integer>  q = new LinkedList<>();
		 q.add(src);
		 while(!q.isEmpty()) {
			 int rv = q.remove();
			 if(rv == dest) {
				 return true;
			 }
			 if(visited.contains(rv)) {
				continue; 
			 }
			 
			 visited.add(rv);
			 for (int nbrs : graph.get(rv).keySet()) {
				 if(!visited.contains(nbrs)) {
					 q.add(nbrs);
				 }	
			}
		 }
		 return false;
	 }
	 
	 public boolean dfs(int src , int dest , HashSet<Integer>  visited) {
		 if(src == dest) {
			 return true;
		 }
		 Stack<Integer>  q = new Stack<>();
		 q.add(src);
		 while(!q.isEmpty()) {
			 int rv = q.pop();
			 if(rv == dest) {
				 return true;
			 }
			 if(visited.contains(rv)) {
				continue; 
			 }
			 
			 visited.add(rv);
			 for (int nbrs : graph.get(rv).keySet()) {
				 if(!visited.contains(nbrs)) {
					 q.add(nbrs);
				 }	
			}
		 }
		 return false;
	 }
	 
}
