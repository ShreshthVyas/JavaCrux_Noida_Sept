package Lecture39;

import java.util.ArrayList;

public class Hashmap <K,V>{
	public class Node{
		K key;
		V value;
		Node next;
		
		public Node(K key, V value){
			this.key =key;
			this.value = value;
		}
	}
	
	public ArrayList<Node> bkt;
	
	public int size =0;
	
	public Hashmap(int s) {
		bkt = new ArrayList<>();
		for (int i = 0; i < s; i++) {
			bkt.add(null);
		}
	}
	public Hashmap() {
		this(4);
	}
	
	public void put(K ki , V val) {
		int idx  = hashfunc(ki);
		Node temp =  bkt.get(idx);
		//already present
		while(temp!=null) {
			if(temp.key.equals(ki)) {
				temp.value = val;
				return;
			}
			temp =temp.next;
		}
		Node nn = new Node(ki,val);
		temp =  bkt.get(idx);
		nn.next = temp;
		bkt.set(idx, nn);
		this.size++;
		double lf = (1.0 *this.size)/ bkt.size();
		double th = 2;
		if(lf>th) {
			rehashing();
		}
	}
	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node>  nb =  new ArrayList<>();
		for (int i = 0; i < 2*bkt.size(); i++) {
			nb.add(null);
		}
		ArrayList<Node> a = bkt;
		bkt = nb;
		for (Node temp : a) {
			while(temp!=null) {
				put(temp.key, temp.value);
				temp= temp.next;
			}
		}
		
		
	}
	public V get(K ki) {
		int idx  = hashfunc(ki);
		Node temp =  bkt.get(idx);
		while(temp!=null) {
			if(temp.key.equals(ki)) {
				return temp.value;
			}
			temp =temp.next;
		}
		return null;
	}
	public boolean containskey(K ki) {
		int idx  = hashfunc(ki);
		Node temp =  bkt.get(idx);
		while(temp!=null) {
			if(temp.key.equals(ki)) {
				return true;
			}
			temp =temp.next;
		}
		return false;
	}
	public void remove(K ki) {
		int idx  = hashfunc(ki);
		Node temp =  bkt.get(idx);
		Node prev  = null;
		while(temp!=null) {
			if(temp.key.equals(ki)) {
				break;
			}
			prev = temp;
			temp =temp.next;
		}
		if(temp == null) { // nahi mila
			return;
		}
		else if(prev == null) { // first mil gaya
			prev  = temp.next;
			bkt.set(idx, prev);
			temp.next =null;
			this.size--;
		}
		else {
			prev.next = temp.next;
			temp.next = null;
			this.size--;
		}	
	}
	
	@Override
	public String toString() {
		String s = "{";
		for (Node temp : bkt) {
			while(temp!=null) {
				s+= temp.key+ "=" + temp.value + ",";
				temp= temp.next;
			}
		}
		s+= "}";
		return s;
	}
	public int hashfunc(K key) {
		int idx = key.hashCode() % bkt.size();
		if(idx<0) {
			idx+= bkt.size();
		}
		return idx;
	}
	
}
