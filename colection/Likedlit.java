package com.colection;

import java.security.DrbgParameters.NextBytes;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Likedlit {

	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		
		linkedList.offer("LOL");
		linkedList.offer("apple");
		linkedList.offer("ds");
		linkedList.offer("mango");
		linkedList.add("banana");
		linkedList.offer("amruth");
		linkedList.offer("graphs");
		linkedList.offer("orange");
		linkedList.add("potato");
		linkedList.offer("tomato");
		linkedList.offer("ginger");
		linkedList.offer("garlic");
		System.out.println("-----1. for loop-----------");
		for (int i = 0; i < linkedList.size(); i++)
		{
				System.out.println("[ "+linkedList.get(i)+" ]");
		}
		System.out.println("----------2. for each loop------------");
		for (Object object : linkedList)
		{
			System.out.println("[ "+object+" ]");
		}
		System.out.println("---------3. while loop-------------");
		Iterator iterator = linkedList.iterator();
		while (iterator.hasNext())
		{
			System.out.println("[ "+iterator.next()+" ]");	
		}
		System.out.println("---------4. while loop backward-------------");
		Iterator lIterator = linkedList.descendingIterator();
		while (lIterator.hasNext())
		{
			System.out.println("[ "+lIterator.next()+" ]");	
		}
		System.out.println("---------5. using list iterator-------------");
		ListIterator listIterator = linkedList.listIterator();
		while (listIterator.hasNext())
		{
			System.out.println("[ "+listIterator.next()+" ]");		
		}
		
		
		System.out.println(linkedList.peekLast());
	}

}
