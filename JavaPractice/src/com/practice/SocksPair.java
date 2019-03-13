package com.practice;

import java.util.HashMap;
import java.util.Map;

public class SocksPair {

	public static void main(String[] args) {
		int[] p = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println(sockMerchant(p.length, p));
	}

	static int sockMerchant(int n, int[] a) {
		int counter = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int count = 0;
			if (map.containsKey(a[i])) {
				count = map.get(a[i]);
			}
			map.put(a[i], ++count);
		}
		for (Integer value : map.values()) {
			counter += value / 2;
		}
		return counter;
	}
}
