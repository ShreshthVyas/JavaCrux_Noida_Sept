package Lecture37;

import java.util.ArrayList;
import java.util.*;


public class Heap {
	private ArrayList<Integer> ll = new ArrayList<>();
	
	public void add(int item) {
		ll.add(item);
		upheapify(ll.size()-1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci-1)/2;
		if(ll.get(pi)>ll.get(ci)) {
			swap(ci,pi);
			upheapify(pi);
		}
	}

	private void swap(int ci, int pi) {
		// TODO Auto-generated method stub
		int tc = ll.get(ci);
		int tp = ll.get(pi);
		ll.set(ci, tp);
		ll.set(pi, tc);		
	}
	
	public int remove() {
		int rv = ll.get(0);
		swap(0, ll.size()-1);
		ll.remove(ll.size()-1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi ) {
		// TODO Auto-generated method stub
		int lci = 2*pi +1;
		int rci = 2*pi +2;
		int mini = pi;
		if(lci <ll.size() && ll.get(mini) > ll.get(lci)) {
			mini = lci;	
		}
		if(rci <ll.size() && ll.get(mini) > ll.get(rci)) {
			mini = rci;
		}
		if(mini!=pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}
	public int peek() {
		return ll.get(0);
	}
	
	public void display() {
		System.out.println(ll);
	}
	
}
