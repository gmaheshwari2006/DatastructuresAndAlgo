package com.practice;

import java.util.Scanner;

class Node {
	int data;
	Node1 left;
	Node1 right;

	public Node(int data2) {
		this.data = data2;
	}

}

public class PreorderTraverse {
	public static void preOrder(Node1 root) {
		System.out.print(root.data);
		System.out.print(" ");
		if (root.left != null) {
			preOrder(root.left);
		}
		if (root.right != null) {
			preOrder(root.right);
		}
	}

	public static Node1 insert(Node1 root, int data) {
		if (root == null) {
			return new Node1(data);
		} else {
			Node1 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node1 root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		preOrder(root);
	}
}
