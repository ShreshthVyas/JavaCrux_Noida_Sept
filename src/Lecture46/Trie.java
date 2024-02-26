package Lecture46;

import java.util.HashMap;

public class Trie {
	public class Node {
		char data;
		HashMap<Character, Node> child = new HashMap<>();
		boolean end;
		public Node(char c) {
			data = c;
		}
	}

	private Node root;

	public Trie() {
		Node nn = new Node('*');
		root = nn;
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				Node nn = new Node(ch);
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.end = true;
	}

	public boolean search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return curr.end;
	}

	public boolean startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return true;
	}
}
