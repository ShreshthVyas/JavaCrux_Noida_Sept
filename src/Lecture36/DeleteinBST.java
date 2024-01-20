package Lecture36;

import Lecture36.InsertIntoBST.TreeNode;

public class DeleteinBST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	 public TreeNode deleteNode(TreeNode root, int key) {
	      if(root == null) {
	    	  return null;
	      }
	      if(root.val>key) {
	    	  root.left = deleteNode(root.left, key);
	      }
	      else if (root.val<key) {
	    	  root.right = deleteNode(root.right, key);
	      }
	      else {
	    	  if(root.left==null) {
	    		  return root.right;
	    	  }
	    	  else if(root.right ==null) {
	    		  return root.left;
	    	  }
	    	  else {
	    		 int temp = max(root.left);
	    		 root.left = deleteNode(root.left, temp);
	    		 root.val = temp;
	    	  }
	      }
	      
	      return root;
	 }
	 public int max(TreeNode root) {
		 if(root == null) {
			 return Integer.MIN_VALUE;
		 }
		 int r = max(root.right);
		 return Math.max(r, root.val);
	 }
}
