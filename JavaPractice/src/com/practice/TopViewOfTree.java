package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfTree {
	Node2 root;

	/*
	 * Given a binary tree. Print its nodes in level order using array for
	 * implementing queue
	 */
	void printLevelOrder() {
		Queue<List<Object>> queue = new LinkedList<>();
		Map<Integer, List<Integer>> hashMap = new TreeMap<>();

		List<Integer> verticalList = new ArrayList<>();
		verticalList.add(root.data);
		hashMap.put(0, verticalList);
		
		List<Object> list = new ArrayList<>(2);
		list.add(0);
		list.add(root);
		queue.add(list);

		while (!queue.isEmpty()) {
			List<Object> node_pair  = queue.poll();
			Node2 leftNode = ((Node2)node_pair.get(1)).left;
			int leftKey = (Integer)node_pair.get(0);
			if (leftNode != null) {
				leftKey--;
				if (hashMap.containsKey(leftKey)) {
					hashMap.get(leftKey).add(leftNode.data);
				} else {
					List<Integer> list_temp = new ArrayList<>();
					list_temp.add(leftNode.data);
					hashMap.put(leftKey, list_temp);
				}
				List<Object> listAsQueueElement = new ArrayList<>();
				listAsQueueElement.add(leftKey);
				listAsQueueElement.add(leftNode);
				queue.add(listAsQueueElement);
			}
			Node2 rightNode = ((Node2)node_pair.get(1)).right;
			int rightKey = (Integer)node_pair.get(0);
			if (rightNode != null) {
				rightKey++;
				if (hashMap.containsKey(rightKey)) {
					hashMap.get(rightKey).add(rightNode.data);
				} else {
					List<Integer> list_temp = new ArrayList<>();
					list_temp.add(rightNode.data);
					hashMap.put(rightKey, list_temp);
				}
				List<Object> listAsQueueElement = new ArrayList<>();
				listAsQueueElement.add(rightKey);
				listAsQueueElement.add(rightNode);
				queue.add(listAsQueueElement);
			}

		}
		
		for (List<Integer> entry : hashMap.values()) {
			for (Integer value : entry) {
				System.out.print(value + " ");
				break;
			}
		}
	}

	public static void main(String args[]) {
		/*
		 * creating a binary tree and entering the nodes
		 */
		TopViewOfTree tree_level = new TopViewOfTree();
		tree_level.root = new Node2(1);
		tree_level.root.left = new Node2(2);
		tree_level.root.right = new Node2(3);
		tree_level.root.left.left = new Node2(4);
		tree_level.root.left.right = new Node2(5);
		tree_level.root.right.left = new Node2(6);
		tree_level.root.right.right = new Node2(7);
		tree_level.root.right.left.right = new Node2(8);
		tree_level.root.right.right.left = new Node2(10);
		tree_level.root.right.right.right = new Node2(9);
		tree_level.root.right.right.left.right = new Node2(11);
		tree_level.root.right.right.left.right.right = new Node2(12);

		System.out.println("Vertical order traversal of binary tree is - ");
		tree_level.printLevelOrder();
	}
}
