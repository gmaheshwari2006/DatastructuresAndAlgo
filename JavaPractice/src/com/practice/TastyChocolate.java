package com.practice;

public class TastyChocolate {

	public static void main(String[] args) {
		TastyChocolate obj = new TastyChocolate();
		int[] a = {698,298,674,484,611,591,538,144,822,930,916,825,948,304,610,54,205,355,385,611,737,538,828,423,685,940,741,336,465,478,442,300,280,908,493,817,351,989,622,440,673,186,884,293,914,815,522,906,187,827,351,453,181,125,505,231,138,288,138,262,448,456,3,669,695,645,408,882,214,519,565,89,593,691,56,759,829,414,206,882,551,878,2,663,626,777,187,811,39,376,510,966,754,196,948,117,498,437,62,487,41,551,453,715,293,109,630,512,487,914,175,868,218,102,827,969,470,717,700,277,317,383,290,113,117,987,214,100,48,237,20,585,328,626,921,614,151,130,505,590,30,237,484,122,916,809,705,851,769,43,252,267,404,739};
		System.out.println(obj.execute(a));
	}

	private int execute(int[] a) {
		
		printarray(a);
		int max = 0;
		int n = a.length - 1;
		int i = 0;

		while (i < n) {
			max = a[i];
			if (a[n] > max) {
				max = a[n];
				n--;
			} else {
				i++;
			}

		}
		System.out.println("output: ");
		System.out.println(a[i]);
		return a[i];
	}

	private void printarray(int[] a) {
		System.out.println("Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(", ");

		}
		System.out.println("");
	}

}
