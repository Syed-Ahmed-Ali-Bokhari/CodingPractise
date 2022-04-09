package binarytree;

public class NodeDepths100 {

	// (Find all triplets with the given sum)

	public static class BinaryTree {
		int value;
		BinaryTree left;
		BinaryTree right;

		BinaryTree(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
	 public static int nodeDepths(BinaryTree root) {
		    
			return nodeDepthsHelp(root,0);
	  }
	 
	public static int nodeDepthsHelp(BinaryTree root,int depth) {
		if (root == null) return 0;
		return depth + nodeDepthsHelp(root.left, depth + 1) + nodeDepthsHelp( root.right, depth + 1);
	}
	
	public static void main(String[] args) {

	}

}
