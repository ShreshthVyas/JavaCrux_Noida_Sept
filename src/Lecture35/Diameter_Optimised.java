package Lecture35;

import Lecture35.Diameter.TreeNode;

public class Diameter_Optimised {

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
	
	public int diameterOfBinaryTree(TreeNode root) {
		Diapair temp = diameter(root) ;
		return temp.dia;
	}
	public Diapair diameter(TreeNode root) {
		if(root == null) {
			return new Diapair();
		}
		Diapair ld = diameter(root.left);
		Diapair rd = diameter(root.right);
		Diapair sd =  new Diapair();
		sd.ht = Math.max(ld.ht, rd.ht) +1;
		int d = ld.ht + rd.ht +2;
		sd.dia = Math.max(d, Math.max(rd.dia, ld.dia));
		return sd;
	}
	
	class Diapair{
		int ht = -1;
		int dia = 0;
	}

}
