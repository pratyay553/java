package com.colection;

import java.util.LinkedList;

public class MergeTwoLinkedlist {
	public static LinkedList merge(LinkedList l,LinkedList l1) {
		l.addAll(l1);
		return l;
	}
	public static LinkedList merge2(LinkedList l,LinkedList l1) {
		for (int i = 0; i <l1.size(); i++) {
			l.offer(l1.get(i));
		}
		return l;
	}
	public static boolean palindrome(LinkedList l) {
			for (int i = 0; i < l.size()/2; i++) {
				if(!l.get(i).equals(l.get(l.size() - i - 1))) {
					return false;
				}
			}
		return true;
	}
	public static void main(String[] args) {
		LinkedList linkedList  = new LinkedList();
		linkedList.add(54);
		linkedList.add(54);
		linkedList.add(54);
		LinkedList linkedList2 = new LinkedList();
		linkedList2.add("pr");
		linkedList2.add("pr");
		linkedList2.add("pr");
		linkedList2.add("pr");
//		System.out.println("merged list is : "+merge(linkedList, linkedList2));
		
		System.out.println(palindrome(linkedList2)?"palindrome":"not palindrome");
		System.out.println(merge2(linkedList, linkedList2));
	}

}
