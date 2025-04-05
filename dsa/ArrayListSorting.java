package com.collection.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSorting {

	public static ArrayList reverse(ArrayList<Integer> a) {
		Collections.sort(a);
		return a;
	}
	public static ArrayList reverseDesc(ArrayList<Integer> a) {
		Collections.sort(a,Collections.reverseOrder());
		return a;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(7);
		a.add(1);
		a.add(8);
		a.add(5);
		System.out.println(a);
//		Collections.sort(a);\
		reverse(a);
		System.out.println(a);
	}
	

}
