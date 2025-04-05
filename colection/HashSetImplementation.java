package com.colection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {

	public static void iterateOverHashSET1(HashSet h) {
		System.out.println("elements of hash set are : ");
		for (Object object : h) {
			System.out.print(object+" ,");
		}
	}
	
	public static void iterateOverHashSET2(HashSet h) {
		Iterator iterator = h.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
	
	public static void iterateOverHashSET3(HashSet h) {
		Object[] a = h.toArray();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void iterateOverHashSET4(HashSet h) {
		ArrayList arrayList = new ArrayList(h);
		 for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		HashSet hSet = new HashSet();
		hSet.add("Old monk pite");
		hSet.add("Bacardi 750");
		hSet.add(7);
		hSet.add(null);
		hSet.add(true);
		
		iterateOverHashSET1(hSet);
		iterateOverHashSET2(hSet);
		iterateOverHashSET3(hSet);
		iterateOverHashSET4(hSet);
		
	}

}
