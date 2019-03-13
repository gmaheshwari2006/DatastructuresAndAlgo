package com.practice;

public class MinMax {

	public static void main(String[] args) {
		long[] p = {256741038, 623958417, 467905213, 714532089, 938071625};
		miniMaxSum(p);
	}

	static void miniMaxSum(long[] arr) {
        long min = 0, max = 0;
        int n = arr.length;
        long[] sums = new long[n];
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j =0; j < n; j++) {
                if(j != i) {
                    sum += arr[j];
                } 
            }
            sums[i] = sum;
        }
        
        min = sums[0];
        max = min;
        for (int i = 0; i < n-1; i++) {
            if (sums[i+1] < min ) {
                min = sums[i+1];
            }
            if (sums[i+1] > max) {
                max = sums[i+1];
            }
        }

        System.out.print(min + " " + max);
    }
}
