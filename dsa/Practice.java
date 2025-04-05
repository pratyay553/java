package com.collection.dsa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class Practice 
{
	// find first duplicate of a string
	
//	public static void firstDup(String s) {
//		HashMap<Character,Integer> hs1 = new HashMap<Character,Integer>(); 
//		for (int i = 0; i < s.length(); i++) {
//			Character character = s.charAt(i);
//			
//			if(hs1.containsKey(character)) {
//				System.out.println(character);
//				break;
//			}
//			
//			hs1.put(character, hs1.getOrDefault(character, 0)+1);
//		}
//	}
//	
//	//remove duplicate from string
//	
//	public static String rev(String s) {
//		HashMap<Character,Integer> hs1 = new HashMap<Character,Integer>();
//		for (int i = 0; i <s.length(); i++) {
//			Character c = s.charAt(i);
//			hs1.put(c, i);
//		}
//		
//		
//		return s;
//	}
//	
//	//
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		System.out.println(args.toString());
		
//	firstDup("programming");
//	System.out.println(rev("programming"));
	}

}
