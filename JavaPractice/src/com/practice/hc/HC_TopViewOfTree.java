package com.practice.hc;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class HC_TopViewOfTree {
	public static void topView(Node root) {
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
            Node leftNode = ((Node)node_pair.get(1)).left;
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
            Node rightNode = ((Node)node_pair.get(1)).right;
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

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
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
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}