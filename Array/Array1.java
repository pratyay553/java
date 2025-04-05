package com.Array;

import java.util.Arrays;

public class Array1 {
	public static int sumofArray(int[] x) {
		int sum =0;
		for(int i=0;i<x.length;i++) {
			sum+=x[i];
		}
		return sum;
	}
	public static void printArray(int[] x) {
		System.out.print(Arrays.toString(x));
	}
	public static void main(String[] args) {
		
		int[] a = {3,4,6,8};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int sum = sumofArray(a);
		System.out.println("Sum of all values : " + sum);
		printArray(a);
	}

}
