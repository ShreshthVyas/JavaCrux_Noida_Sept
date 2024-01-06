package Lecture34;

import java.util.*;
import java.util.Scanner;

public class BinaryTree {
	public class Node {
		int data;
		Node left;
		Node right;
//		public Node() {
//			
//		}
	}
	Scanner sc = new Scanner(System.in);
	private Node root;
	
	public BinaryTree() {
		this.root = createTree();
	}

	private Node createTree() {
		// TODO Auto-generated method stub
		Node nn= new Node();
		int item = sc.nextInt();
		nn.data = item;
//		System.out.println("Has left Child ?");
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left= createTree();
		}
//		System.out.println("Has right Child ?");
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right= createTree();
		}
		return nn;
	}
	
	public void Display() {
		display(root);
	}

	private void display(Node temp) {
		// TODO Auto-generated method stub
		if(temp==null) {
			return;
		}
		String s= ""+ temp.data;
		if(temp.left!=null) {
			s = temp.left.data + "<=="+ s;
		}
		else {
			s = ". <=="+ s;
		}
		if(temp.right!=null) {
			s = s + "==>" + temp.right.data;
		}
		else {
			s = s + "==> . ";
		}
		System.out.println(s);
		display(temp.left);
		display(temp.right);	
	}
	
	public int Max() {
		return max(this.root);
	}

	private int max(Node nn) {
		// TODO Auto-generated method stub
		if(nn ==null) {
			return Integer.MIN_VALUE;
		}
		int l= max(nn.left);
		int r = max(nn.right);
		
		return Math.max(nn.data, Math.max(l, r));
		
	}
	public boolean Find(int item) {
		return find(item ,root);
	}

	private boolean find(int item , Node nn) {
		// TODO Auto-generated method stub
		if(nn ==null) {
			return false;
		}
		if(nn.data == item) {
			return true;
		}
		boolean left = find(item, nn.left);
		boolean right  = find(item, nn.right);
		return left || right;
	}
	public int Height() {
		return ht(root);
	}
	public int ht(Node nn) {
		if(nn==null) {
			return -1;
		}
		int lh = ht(nn.left);
		int rh = ht(nn.right);
		
		return Math.max(lh, rh) +1;
	}
	public void PreOrder() {
		pre(root);
		System.out.println();
	}

	private void pre(Node nn) {
		// TODO Auto-generated method stub
		if(nn==null) {
			return;
		}
		System.out.print(nn.data+ " ");//N
		pre(nn.left);//L
		pre(nn.right);//R
		
	}
	
	public void InOrder() {
		in(root);
		System.out.println();
	}

	private void in(Node nn) {
		// TODO Auto-generated method stub
		if(nn==null) {
			return;
		}
		
		pre(nn.left);//L
		System.out.print(nn.data+ " ");//N
		pre(nn.right);//R
	}
	public void PostOrder() {
		post(root);
		System.out.println();
	}

	private void post(Node nn) {
		// TODO Auto-generated method stub
		if(nn==null) {
			return;
		}
		
		pre(nn.left);//L
		pre(nn.right);//R
		System.out.print(nn.data+ " ");//N
	}
	
	public void levelorder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp= q.remove();
			System.out.print(temp.data +" ");
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
		System.out.println();
	}
	
	
	
}
