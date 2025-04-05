package com.colection;

import java.awt.PopupMenu;
import java.util.Stack;

public class StringReverse {

	public static String revStringUsingStack(String s) {
		String string2 = "";
		Stack<Character> kStack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			kStack.push(s.charAt(i));
		}
//		for (int i = 0; i < s.length(); i++) 
//		{
//			string2 = string2 + kStack.pop();
//		}
		
		while (!kStack.empty()) {
			string2 = string2 + " " + kStack.pop();
			
		}
		s = string2;
		return s;
	}
	public static void main(String[] args) {
		String string = "pratyay";
		
		System.out.println("reverse order : "+ revStringUsingStack(string));
	}

}
