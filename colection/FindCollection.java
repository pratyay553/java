package com.colection;

import java.util.ArrayList;
import java.util.Iterator;

public class FindCollection {
	public static void findInt(ArrayList<Integer> a) {
		Iterator<Integer> iterator = a.iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			if(integer>=50 && integer<=100) {
				System.out.println(integer);
			}

		}
	}
	public static void findChar(ArrayList<Character> a) {
		Iterator<Character> i = a.iterator();
		while(i.hasNext()) {
			char c = i.next();
			if (c>=97 && c<=103) {
				System.out.println(c);
			}
		}
	}
	
	public static void stringFirstChar(ArrayList<String> a) {
		Iterator<String> i = a.iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.println(s.charAt(0));
		}
	}
	
	public static void main(String[] args) {
//	ArrayList<Integer> arrayList = new ArrayList<Integer>();
//	arrayList.add(56);
//	arrayList.add(34);
//	arrayList.add(32);
//	arrayList.add(94);
//	arrayList.add(87);
//	findInt(arrayList);
	
		
		//=====================================//
		
//	ArrayList<Character> a = new ArrayList<Character>();
//	a.add('e');
//	a.add('b');
//	a.add('a');
//	a.add('s');
//	findChar(a);
	
		
		//========================================//
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("hello");
		a.add("kwee");
		a.add("lskjjs");
		a.add("jiaa");
		stringFirstChar(a);
	
}
}
//1. wap to 
//print only char from a to f
//print only integer from 50 to 100
//print only String object starts from s
//print only String object endss from a





