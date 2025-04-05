package com.colection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class SortHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hSet = new HashSet<Integer>();
		hSet.add(51);
		hSet.add(4);
		hSet.add(3);
		hSet.add(1);
		hSet.add(65);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(hSet);
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>(hSet);
		Collections.sort(linkedList);
		System.out.println(hSet);
		System.out.println("reverse order is : "+linkedList);

	}

}
