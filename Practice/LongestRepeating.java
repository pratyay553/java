package com.Practice;

import java.security.PublicKey;
import java.util.Arrays;

public class LongestRepeating {

	public static void LongestRepeatingCharReplace(String s) {
//		String[] str = s.split("");
//		String newString = "";
//		int k =0;
//		for (int i = 0; i < str.length; i++) {
//			inner1:	for (int j = i+1; j < str.length; j=k+1) {
//				if(str[i].equals(str[j])) {
//					newString = newString + str[i];
//					k=j;
//					break inner1;
//				}
//			}
//		}
//		System.out.println(newString);
	
	}
	
	public static void main(String[] args) {
		String s = "geeksforgeeks";
//		String[] strings = string.split("");
//		System.out.println(Arrays.toString(strings));//[g, e, e, k, s, f, o, r, g, e, e, k, s]
//		for (int i = 0; i < strings.length; i++) {
//			System.out.print(strings[i]+"+");//g+e+e+k+s+f+o+r+g+e+e+k+s+
//			
//		}
//		System.out.println("-----------------------------");
//		String string2 = "";
//		for (int i = 0; i < strings.length; i++) {
//		//System.out.print(string.charAt(i)+"+");//g+e+e+k+s+f+o+r+g+e+e+k+s+
//		string2 = string2 + string.charAt(i);
//		}
//		System.out.println(string2);
//		
//		
//		System.out.println(string.contains(strings[1]));
		String[] strings = s.split("");
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
			newString = newString+strings[i];
		}
		System.out.println(newString);
		int[] a= {1,2,3,4};
		System.out.println(a.toString());

	}

}
