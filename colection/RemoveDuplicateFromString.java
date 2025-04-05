package com.colection;

import java.util.HashSet;

public class RemoveDuplicateFromString {
	public static HashSet removeDuplicate(String[] strings) {
		HashSet hSet2 = new HashSet();
		HashSet hSet3 = new HashSet();
		for (String i : strings) {
			if(hSet2.add(i)==false) {
				hSet3.add(i);
			}
		}
		return hSet3;
	}
	public static void main(String[] args) {
		String string = "big black dog is sitting on big black nose of big black dog";
		String[] strings = string.split(" ");
		
		HashSet hSet = new HashSet();
		for (int i = 0; i < strings.length; i++) {
			hSet.add(strings[i]);//to maintain order linkedhashset will used
		}
		
		
//		for (Object object : strings) {
//			hSet.add(object);
//		}
//		System.out.println(hSet);

		//HashSet hSet2 = new HashSet();
		
		System.out.println(removeDuplicate(strings));
	}

}
