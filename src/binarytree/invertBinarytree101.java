package binarytree;

public class invertBinarytree101 {

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
	public static void invertBinaryTree(BinaryTree tree) {
	    if (tree == null)
			{return;}
			swapLeftRight(tree);		
			invertBinaryTree(tree.left);
			invertBinaryTree(tree.right);
	  }
		private static void swapLeftRight(BinaryTree tree) {
			BinaryTree left = tree.left;
			tree.left = tree.right;
			tree.right = left;		
	  }
	
	public static void main(String[] args) {

	}

}
