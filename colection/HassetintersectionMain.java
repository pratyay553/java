package com.colection;

import java.util.LinkedHashSet;

public class HassetintersectionMain {
//-------------Intersection---------------------
	public static void commonElements(LinkedHashSet ll ,LinkedHashSet l) {
		ll.retainAll(l);
		System.out.println(l);
	}
	public static void commonElements1(LinkedHashSet ll ,LinkedHashSet l) {

		LinkedHashSet l1 = new LinkedHashSet();
		for (Object o : l) {
			l1.add(o);
		}
		
		for (Object o : ll) {
			l1.add(o);
		}
		
		System.out.println(l1);
	}
	
//-------------------------------Union-------------------
	public static void union(LinkedHashSet ll ,LinkedHashSet l) {
		ll.addAll(l);
		System.out.println(ll);
		
	}
	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();
		LinkedHashSet ll = new LinkedHashSet();
		
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(3);
		l.add(5);
		
		ll.add(1);
		ll.add(3);
		ll.add(4);
		ll.add(7);
		
		//commonElements(ll, l);
		union(ll, l);
	}

}
