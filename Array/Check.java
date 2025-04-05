package com.Array;

import java.util.Arrays;

public class Check {
public static void main(String[] args) {
	
	//--------------Arrays.compare(a,a1)------------------------
	
	//check whether two arrays have same element or not
	//if yes -> return 0
	//if not -> return -1
	
	int[] a = {1,2,3,4};
	int [] a1 = {6,7,67,8};
	System.out.println(Arrays.compare(a, a1));//-1
	
	int [] a2 = {1,2,3,4};
	System.out.println(Arrays.compare(a, a2));//0
	
	//--------------------asList()--------------
	
	//a = {1,2,3,4}
	//a1 = {6,7,67,8}
	
}
}
