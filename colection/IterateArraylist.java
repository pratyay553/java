package com.colection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArraylist {
public static void main(String[] args) {
	ArrayList aList = new ArrayList();
	
	aList.add(1);
	aList.add("pratyay");
	aList.add(true);
	aList.add("banana");
	aList.add("rohit");
	aList.add(1.4d);
	aList.add("souvik");
	aList.add(4.3f);
	
	System.out.println(aList);
	
	Iterator i = aList.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());	
	}
	System.out.println("*********************");
	System.out.println("Iterate through ArrayList : 1");
	ListIterator listIterator = aList.listIterator();
	while (listIterator.hasNext()) {
		System.out.println(listIterator.next());	
	}
	
	while (listIterator.hasPrevious()) {
		System.out.print(listIterator.previous()+" ,");	
	}
	
	
	System.out.println("****************************************");
	System.out.println("Iterate through ArrayList : 1");
	ListIterator lI = aList.listIterator(aList.size()-1);
	while (lI.hasPrevious()) {
		System.out.print(lI.previous() + " ,");	
	}
}
}
