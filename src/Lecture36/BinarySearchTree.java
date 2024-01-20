package Lecture36;

import Lecture34.BinaryTree.Node;

public class BinarySearchTree {
	public class Node {
		int data;
		Node left;
		Node right;
//		public Node() {
//			
//		}
	}
	private Node root;
	
	public void creatTree(int arr[]) {
		this.root = createtree(arr,0,arr.length-1);
		
	}

	private Node createtree(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return null;
		}
		int mid = (si + ei)/2;
		Node nn = new Node();
		nn.data = arr[mid];
		nn.left = createtree(arr, si, mid-1);
		nn.right = createtree(arr, mid+1, ei);
		return nn;
	}
	   
}
