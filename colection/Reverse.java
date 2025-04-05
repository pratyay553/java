package com.colection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;



public class Reverse {
	
public static void rev(LinkedList<String> l) 
{
		LinkedList<String> reverseLinkedList = new LinkedList<String>();
		Iterator<String> iterator = l.descendingIterator();
		while (iterator.hasNext())
		{	
			reverseLinkedList.add(iterator.next());
         }
		System.out.println("after reverse "+reverseLinkedList);
}
public static void rev2(LinkedList<String> l) 
{
		Collections.reverse(l);
		System.out.println(l);
}
public static LinkedList rev3(LinkedList<String> l) 
{
		for (int iterator = 0; iterator < l.size()/2;iterator++) {
			l.set(iterator, l.set(l.size() - 1 - iterator, l.get(iterator)));
			
		}
		return l;
}
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("hi");
		linkedList.add("hello");
		linkedList.add("bye");
		linkedList.add("bye");
		linkedList.add("Tata");
		linkedList.add("suzuki");
		linkedList.add("Lambo");
		
		
		System.out.println(linkedList.reversed());
		rev(linkedList);
		
		rev2(linkedList);
		System.out.println(rev3(linkedList));
		
	}

}
