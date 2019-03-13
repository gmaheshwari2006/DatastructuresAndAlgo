package com.practice;

import java.util.Queue;
import java.util.LinkedList;

class Node2 {
	int data;
	Node2 left, right;

	public Node2(int item) {
		data = item;
		left = null;
		right = null;
	}
}

public class LevelOrderTreeTraversal {
	Node2 root;

	/*
	 * Given a binary tree. Print its nodes in level order using array for
	 * implementing queue
	 */
	void printLevelOrder() {
		Queue<Node2> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node2 node = queue.poll();
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
			System.out.println(node.data);
		}
	}

	public static void main(String args[]) {
		/*
		 * creating a binary tree and entering the nodes
		 */
		LevelOrderTreeTraversal tree_level = new LevelOrderTreeTraversal();
		tree_level.root = new Node2(1);
		tree_level.root.left = new Node2(2);
		tree_level.root.right = new Node2(3);
		tree_level.root.left.left = new Node2(4);
		tree_level.root.left.right = new Node2(5);

		System.out.println("Level order traversal of binary tree is - ");
		tree_level.printLevelOrder();
	}
}
