package com.Practice;

import java.util.Iterator;

public class LongestSubString {

	public static int findSubString(String s) {
		String str = " ";
		int cnt = 0;
		String[] c = s.split("");
		for (int i = 0; i < c.length; i++) {
			if(str.contains(c[i])==false) {
				str = str + c[i];
				cnt++;
			}
		}
		System.out.println(str);
		return cnt;
	}
	
	public static int findByExtractingElement(String s) {
		String string = "";
		int cnt = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			
		}
		return 0;
		
	}
	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		System.out.println(findSubString(str));

	}

}
