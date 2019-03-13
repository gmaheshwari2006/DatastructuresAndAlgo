package com.practice;

public class StringMatchInArray {

	public static void main(String[] args) {
		int[][] q = new int[3][3];
		q[0][0] = 1;
		q[0][1] = 2;
		q[0][2] = 100;

		q[1][0] = 2;
		q[1][1] = 5;
		q[1][2] = 100;

		q[2][0] = 3;
		q[2][1] = 4;
		q[2][2] = 100;

		System.out.println(arrayManipulation(5, q));
	}

	 static long arrayManipulation(int n, int[][] q) {
	        int[] t = new int[n];
	        for (int i = 0; i < t.length; i++) 
	        {
	            t[i] = 0;
	        }
	        int max = t[0];
	        for (int i = 0; i < q.length; i++) {
	            for (int j = q[i][0]; j < q[i][1]; j++) {
	                t[j] += q[i][2];
	            }
	        }
	        for (int i = 0; i < t.length-1; i++) {
	            if (t[i+1] > max) {
	                max = t[i+1];
	            }
	        }
	        return max;
	    }
}
