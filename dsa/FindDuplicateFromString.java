package com.collection.dsa;

import java.util.HashMap;

public class FindDuplicateFromString {
	public static HashMap<Character, Integer> findDup(String s) {
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			hm1.put(c, hm1.getOrDefault(c, 0)+1);
		}
		return hm1;
	}
	public static void firstDuplicateValue(String s) {
	HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (hm1.containsKey(c)) {
				System.out.println(c);
				 break;
			}
			hm1.put(c, hm1.getOrDefault(c, 0)+1);
		}
		
	}
	
public static void main(String[] args) {
	HashMap<Character, Integer> hMap = findDup("programming");
	firstDuplicateValue("programming");
	System.out.println(findDup("kemon acho"));
}
}
