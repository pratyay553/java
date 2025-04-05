package com.solvestring;

import java.util.Scanner;

public class DecodeString {
public static String decode(String s) {
	String newstString = "";
	int k = 0;
	for (int i = 0; i < s.length() ; i++) 
	{
		if(s.charAt(i) != ']' && s.charAt(i)!= '[') 
		{
			newstString = newstString + s.charAt(i);
		}
	}
	return newstString;
	
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(decode(string));

	}

}
