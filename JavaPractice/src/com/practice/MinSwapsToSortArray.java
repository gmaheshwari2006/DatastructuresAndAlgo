package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Graph {
	int v;
	List<Integer> adj[];

	Graph(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<>();
	}
}

public class MinSwapsToSortArray {

	public static void main(String[] args) {
		int[] a = { 3, 0, 1, 2, 4, 5 };
		System.out.println(execute(a));
	}

	static int execute(int[] a) {
		int[] sortedArray = { 0, 1, 2, 3, 4, 5 };
		Graph graph = new Graph(a.length);
		int[] visited = new int[a.length];
		int counter = 0;
		for (int i = 0; i < visited.length; i++)
			visited[i] = 0;
		for (int i = 0; i < a.length; i++) {
			int j = 0;
			for (; j < sortedArray.length; j++) {
				if (a[i] == sortedArray[j]) {
					break;
				}
			}
			graph.adj[i].add(j);
		}

		for (int i = 0; i < graph.adj.length; i++) {
			List<Integer> edge = graph.adj[i];
			int index = 0;
			while (index < graph.adj[i].size()) {
				if (visited[edge.get(index)] == 0) {
					visited[edge.get(index)] = 1;
					i = edge.get(index);
					index++;
					counter++;
				} else {
					break;
				}
			}
		}
		return counter - 1;
	}

	static void printarray(int[] a) {
		System.out.println("Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(", ");

		}
		System.out.println("");
	}

}
