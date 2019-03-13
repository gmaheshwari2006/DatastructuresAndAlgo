package com.practice.hc;

public class InsertNodeInBST {
	Node root;
	
	public static Node insert(Node root,int data) {
        if(root.data > data) {
            if (root.left != null) {
                return insert(root.left, data);
            } else {
                root.left.data = data;
            }
        }
        else if (root.data < data) {
            if (root.right != null) {
                return insert(root.right, data);
            } else {
                root.right.data = data;
            }
         }   
         return root; 
    }
	
	
	public static void main(String args[]) {
		/*
		 * creating a binary search tree and entering the nodes
		 */
		InsertNodeInBST tree_level = new InsertNodeInBST();
		tree_level.root = new Node(50);
		tree_level.root.left = new Node(30);
		tree_level.root.right = new Node(70);
		tree_level.root.left.left = new Node(20);
		tree_level.root.left.right = new Node(40);
		tree_level.root.right.left = new Node(60);
		tree_level.root.right.right = new Node(80);
		/*tree_level.root.right.left.right = new Node(8);
		tree_level.root.right.right.left = new Node(10);
		tree_level.root.right.right.right = new Node(9);
		tree_level.root.right.right.left.right = new Node(11);
		tree_level.root.right.right.left.right.right = new Node(12);*/

		System.out.println("Vertical order traversal of binary tree is - ");
		tree_level.insert(tree_level.root, 10);
		
		tree_level.inorderRec(tree_level.root);
	}
	
	// A utility function to do inorder traversal of BST 
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.data); 
            inorderRec(root.right); 
        } 
    } 
}
