package com.colection;

import java.util.LinkedHashSet;

public class LinkedHasSetClass {

	public static void main(String[] args) {
		String string = "big black dog is sitting on big black nose of big black dog";
		String[] s = string.split(" ");
		
		LinkedHashSet<String> ll = new LinkedHashSet<String>();
		for (String o : s) {
			ll.add(o);
		}
		System.out.println(ll);
		System.out.println("After removing duplicates new string is : ");
		string = "";
		for (String o : ll) {
			
		}

	}

}
