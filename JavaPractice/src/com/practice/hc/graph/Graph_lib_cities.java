package com.practice.hc.graph;

public class Graph_lib_cities {

	public static void main(String[] args) {
//		3 3 2 1
		long value = roadsAndLibraries(3, 2, 1, new int[3][3]);
		System.out.println(value);

	}
	 static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
	        int x = 0;
	        long m = cities.length;
	        long ans;
	        if (c_lib < c_road) {
	            ans = c_lib * n;
	        } else {
	           System.out.println("m : " + m);
	            if (m < (n-1)) {
	                ans = ((n - (m + 1) + 1)* c_lib) +  c_road *  m;
	            } else {
	                ans = (c_road * (n - 1)) + c_lib + x * c_lib;
	            }
	        }
	    return ans;
	    }
}
