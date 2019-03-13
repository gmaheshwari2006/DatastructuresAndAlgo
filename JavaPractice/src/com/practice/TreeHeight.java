package com.practice;
// Java program to find height of tree 
// A binary tree node 
class Node1 {
	int data;
	Node1 left, right;

	Node1(int item) {
		data = item;
		left = right = null;
	}
}

class TreeHeight {
	Node1 root;

	/*
	 * Compute the "maxDepth" of a tree -- the number of nodes along the longest
	 * path from the root node down to the farthest leaf node.
	 */
	int maxDepth(Node1 node) {
		if (node == null)
			return 0;
		else {
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			/* use the larger one */
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		TreeHeight tree = new TreeHeight();

		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);

		System.out.println("Height of tree is : " + tree.maxDepth(tree.root));
	}
}

// This code has been cpontributed by Mayank Jaiswal(mayank_24)
