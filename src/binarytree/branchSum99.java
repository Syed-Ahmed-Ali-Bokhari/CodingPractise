package binarytree;

import java.util.ArrayList;
import java.util.List;

public class branchSum99 {

	// This is the class of the input root. Do not edit it.
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

	 public static List<Integer> branchSums(BinaryTree root) {
		    ArrayList<Integer> sum =  new ArrayList<Integer>();
				calculatebranchSums(root,0,sum);
		    return sum;
		  }
	 public static void calculatebranchSums(BinaryTree node, int runningSum, ArrayList<Integer> sum) {
			if (node == null)
				return;
			int newrunningSums = runningSum + node.value;
			if (node.left == null && node.right == null)
			{
				sum.add(newrunningSums);
				return;
			}
			calculatebranchSums(node.left,newrunningSums,sum);
			calculatebranchSums(node.right,newrunningSums,sum);
	    
	  }
	
	public static void main(String[] args) {

	}
}
