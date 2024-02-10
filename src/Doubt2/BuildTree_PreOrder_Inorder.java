package Doubt2;

import Doubt2.Tree_rightview.TreeNode;

public class BuildTree_PreOrder_Inorder {
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
	 public TreeNode buildTree(int[] preorder, int[] inorder) {
	      return dfs(preorder,0,preorder.length-1,inorder, 0, inorder.length-1);  
	    }
	private TreeNode dfs(int[] pre, int ps, int pe, int[] in, int ins, int ine ) {
		// TODO Auto-generated method stub
		if(ps>pe || ins>ine) {
			return null;
		}
		TreeNode nn= new TreeNode(pre[ps]);
		int idx= find(in, pre[ps], ins, ine);
		int noe = idx - ins;
		nn.left = dfs(pre, ps+1, ps+noe, in, ins, idx-1);
		nn.right = dfs(pre, ps+noe+1, pe, in, idx+1, ine);
		return nn;
	}
	private int find(int[] in, int item, int ins, int ine) {
		// TODO Auto-generated method stub
		for (int j =ins ; j <=ine; j++) {
			if(in[j] == item) {
				return j;
			}
		}
		return -1;
	}
}
