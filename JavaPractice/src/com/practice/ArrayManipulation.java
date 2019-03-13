package com.practice;

public class ArrayManipulation {

	public static void main(String[] args) {
		String[] strings = {"aba", "baba", "aba", "xzxb"};
		String[] queries = {"aba", "xzxb", "ab"};
		matchingStrings(strings, queries);
	}

	 static int[] matchingStrings(String[] s, String[] q) {
	        int n = q.length;
	        int[] out = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            int count = 0;
	            for (int j = 0; j < s.length; j++) {
	                if (q[i].equals(s[j])) {
	                    count += 1;
	                }
	            }
	            out[i] = count;
	        }
	        for (int i = 0; i < n; i++) { 
	             System.out.println(out[i]);
	         }
	        return out;
	    }
}
